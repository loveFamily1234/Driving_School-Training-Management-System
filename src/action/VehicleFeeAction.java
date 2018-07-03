package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Vehicle;
import entity.VehicleFee;
import service.VehicleFeeService;
import service.VehicleService;

public class VehicleFeeAction extends ActionSupport implements ModelDriven<VehicleFee> {

	private VehicleFee vehicleFee = new VehicleFee();

	@Override
	public VehicleFee getModel() {
		return vehicleFee;
	}

	private VehicleFeeService vehicleFeeService;

	public void setVehicleFeeService(VehicleFeeService vehicleFeeService) {
		this.vehicleFeeService = vehicleFeeService;
	}


	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	// 提供一个查询所有车辆开销信息的方法：
	public String findAll() {
		PageBean<VehicleFee> pageBean = vehicleFeeService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
	//注入VehicleService类
	private VehicleService vehicleService;
	
	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	// 跳转到添加车辆开销页面的方法：
	public String saveUI() {
		// 查询所有车辆
		List<Vehicle> list = vehicleService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}
	
	public String save(){
		vehicleFeeService.save(vehicleFee);
		return "saveSuccess";
	}
	
	//清空记录
	public String deleteAll(){
		vehicleFeeService.deleteAll();
		return "deleteAllSuccess";
	}
	
	//删除某条记录
	public String delete(){
		vehicleFee = vehicleFeeService.findById(vehicleFee.getId());
		vehicleFeeService.delete(vehicleFee);
		return "deleteSuccess";
	}

}

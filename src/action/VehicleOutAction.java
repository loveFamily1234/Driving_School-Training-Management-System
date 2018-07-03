package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Teacher;
import entity.VehicleOut;
import service.VehicleOutService;

public class VehicleOutAction extends ActionSupport implements ModelDriven<VehicleOut>{

	private VehicleOut  vehicleOut = new VehicleOut();
	
	@Override
	public VehicleOut getModel() {
		return vehicleOut;
	}
	
	//注入业务层类
	private VehicleOutService vehicleOutService;

	public void setVehicleOutService(VehicleOutService vehicleOutService) {
		this.vehicleOutService = vehicleOutService;
	}
	
	// 添加出车记录执行的方法：
		public String saveOut() {
			vehicleOutService.saveOut(vehicleOut);
			return "saveSuccess";
		}
		
		// 编辑出车记录执行的方法：
		public String editOut() {
			//查询该条记录
			vehicleOut = vehicleOutService.findByPlateNumber(vehicleOut.getPlateNumber());
			return "editSuccess";
		}
		
		// 修改车辆信息执行的方法：
		public String updateOut() {
			vehicleOutService.updateOut(vehicleOut);
			return "updateSuccess";
		}

		// 删除车辆信息执行的方法：
		public String deleteOut() {
			vehicleOut = vehicleOutService.findByPlateNumber(vehicleOut.getPlateNumber());// （1）先查询该对象
			vehicleOutService.deleteOut(vehicleOut);// （2）再进行删除 //(1)(2)可完成级联删除
			return "deleteSuccess";
		}
}

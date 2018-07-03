package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Teacher;
import entity.Vehicle;
import entity.VehicleOut;
import service.TeacherService;
import service.VehicleService;

public class VehicleAction extends ActionSupport implements ModelDriven<Vehicle> {

	private Vehicle vehicle = new Vehicle();

	@Override
	public Vehicle getModel() {
		return vehicle;
	}

	// 注入业务层类
	private VehicleService vehicleService;

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	// 提供一个查询的方法：
	public String findAll() {
		PageBean<Vehicle> pageBean = vehicleService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	// 注入教练的业务层类
	private TeacherService teacherService;

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	// 跳转到添加车辆信息页面的方法：
	public String saveUI() {
		// 查询所有教练
		List<Teacher> list = teacherService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	// 添加车辆信息执行的方法：
	public String save() {
		vehicleService.save(vehicle);
		return "saveSuccess";
	}

	// 编辑车辆信息的执行的方法：
	public String edit() {
		vehicle = vehicleService.findByPlateNumber(vehicle.getPlateNumber());
		// 查询所有的教练
		List<Teacher> list = teacherService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}

	// 修改车辆信息执行的方法：
	public String update() {
		vehicleService.update(vehicle);
		return "updateSuccess";
	}

	// 删除车辆信息执行的方法：
	public String delete() {
		vehicle = vehicleService.findByPlateNumber(vehicle.getPlateNumber());// （1）先查询该对象
		vehicleService.delete(vehicle);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
	// 提供一个查询所有出车记录的方法：
		public String findAllOut() {
			PageBean<VehicleOut> pageBean = vehicleService.findByPageOut(currPage);
			// 将pageBean存入到值栈中
			ActionContext.getContext().getValueStack().push(pageBean);
			return "findAllOut";
		}

		// 跳转到添加出车记录页面的方法：
		public String saveUIOut() {
			// 查询所有车辆
			List<Vehicle> list = vehicleService.findAll();
			// 保存到值栈中，集合用set方法，对象用push方法。
			ActionContext.getContext().getValueStack().set("list", list);
			return "saveUIOut";
		}
		
		
		/*
		 * 下面是和车辆型号管理相关的一些方法
		 */
		
		public String findAllTypes() {
			PageBean<Vehicle> pageBean = vehicleService.findByPage(currPage);
			// 将pageBean存入到值栈中
			ActionContext.getContext().getValueStack().push(pageBean);
			return "findAllTypes";
		}
		
		public String saveUIType() {
			return "saveUIType";
		}

		public String saveType() {
			vehicleService.save(vehicle);
			return "saveTypeSuccess";
		}

		public String editType() {
			vehicle = vehicleService.findByPlateNumber(vehicle.getPlateNumber());
			return "editTypeSuccess";
		}

		public String updateType() {
			vehicleService.update(vehicle);
			return "updateTypeSuccess";
		}

		public String deleteType() {
			vehicle = vehicleService.findByPlateNumber(vehicle.getPlateNumber());// （1）先查询该对象
			vehicleService.delete(vehicle);// （2）再进行删除 //(1)(2)可完成级联删除
			return "deleteTypeSuccess";
		}
}

package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.StudentFee;
import entity.StudentVehicle;
import entity.Vehicle;
import service.StudentService;
import service.StudentVehicleService;
import service.VehicleService;

public class StudentVehicleAction extends ActionSupport implements ModelDriven<StudentVehicle> {

	private StudentVehicle studentVehicle = new StudentVehicle();

	@Override
	public StudentVehicle getModel() {
		return studentVehicle;
	}

	// 注入业务层类
	private StudentVehicleService studentVehicleService;

	public void setStudentVehicleService(StudentVehicleService studentVehicleService) {
		this.studentVehicleService = studentVehicleService;
	}

	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	private VehicleService vehicleService;

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	public String saveUI() {
		// 查询所有学员
		List<Student> listStu = studentService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("listStu", listStu);
		// 查询所有车辆
		List<Vehicle> listVeh = vehicleService.findAll();
		ActionContext.getContext().getValueStack().set("listVeh", listVeh);
		return "saveUI";
	}

	public String save() {
		studentVehicleService.save(studentVehicle);
		return "saveSuccess";
	}

	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String findAll() {
		PageBean<StudentVehicle> pageBean = studentVehicleService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllSuccess";
	}

	public String edit() {
		// 查询该条记录
		studentVehicle = studentVehicleService.findByIDnumber(studentVehicle.getIDnumber());
//		// 查询所有学员
//		List<Student> listStu = studentService.findAll();
//		// 保存到值栈中，集合用set方法，对象用push方法。
//		ActionContext.getContext().getValueStack().set("listStu", listStu);
		// 查询所有车辆
		List<Vehicle> listVeh = vehicleService.findAll();
		ActionContext.getContext().getValueStack().set("listVeh", listVeh);
		return "editSuccess";
	}

	public String update() {
		studentVehicleService.update(studentVehicle);
		return "updateSuccess";
	}

	public String delete() {
		studentVehicle = studentVehicleService.findByIDnumber(studentVehicle.getIDnumber());// （1）先查询该对象
		studentVehicleService.delete(studentVehicle);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
}

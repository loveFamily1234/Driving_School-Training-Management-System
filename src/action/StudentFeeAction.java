package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.StudentFee;
import entity.VehicleFee;
import service.StudentFeeService;
import service.StudentService;

public class StudentFeeAction extends ActionSupport implements ModelDriven<StudentFee> {

	private StudentFee studentFee = new StudentFee();

	@Override
	public StudentFee getModel() {
		return studentFee;
	}

	// 注入业务层类
	private StudentFeeService studentFeeService;

	public void setStudentFeeService(StudentFeeService studentFeeService) {
		this.studentFeeService = studentFeeService;
	}

	// 注入StudentService类
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	// 跳转到添加学员缴费退费页面的方法：
	public String saveUI() {
		// 查询所有学员
		List<Student> list = studentService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save() {
		studentFeeService.save(studentFee);
		return "saveSuccess";
	}

	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String findAll() {
		PageBean<StudentFee> pageBean = studentFeeService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllSuccess";
	}

	public String edit() {
		// 查询该条记录
		studentFee = studentFeeService.findById(studentFee.getId());
		// 查询所有学员
		List<Student> list = studentService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		studentFeeService.update(studentFee);
		return "updateSuccess";
	}

	public String delete() {
		studentFee = studentFeeService.findById(studentFee.getId());// （1）先查询该对象
		studentFeeService.delete(studentFee);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
	public String deleteAll(){
		studentFeeService.deleteAll();
		return "deleteAllSuccess";
	}
}

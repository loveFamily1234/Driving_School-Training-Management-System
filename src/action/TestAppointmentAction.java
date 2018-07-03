package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.StudentVehicle;
import entity.TestAppointment;
import entity.Vehicle;
import service.StudentService;
import service.TestAppointmentService;

public class TestAppointmentAction extends ActionSupport implements ModelDriven<TestAppointment>{

	private TestAppointment testAppointment = new TestAppointment();
	
	@Override
	public TestAppointment getModel() {
		return testAppointment;
	}

	//注入业务层类
	private TestAppointmentService testAppointmentService;

	public void setTestAppointmentService(TestAppointmentService testAppointmentService) {
		this.testAppointmentService = testAppointmentService;
	}
	
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String saveUI() {
		// 查询所有学员
		List<Student> listStu = studentService.findAll();
		// 保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("listStu", listStu);
		return "saveUI";
	}
	
	public String save(){
		testAppointmentService.save(testAppointment);
		return "saveSuccess";
	}
	
	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String findAll() {
		PageBean<TestAppointment> pageBean = testAppointmentService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllSuccess";
	}
	
	public String edit() {
		// 查询该条记录
		testAppointment = testAppointmentService.findById(testAppointment.getId());
		return "editSuccess";
	}

	public String update() {
		testAppointmentService.update(testAppointment);
		return "updateSuccess";
	}

	public String delete() {
		testAppointment = testAppointmentService.findById(testAppointment.getId());// （1）先查询该对象
		testAppointmentService.delete(testAppointment);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
}

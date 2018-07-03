package action;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
/**
 * 教练的action类
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.Teacher;
import entity.Vehicle;
import service.StudentService;
import service.TeacherService;
import service.VehicleService;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>{

	private Teacher teacher = new Teacher();
	
	@Override
	public Teacher getModel() {
		return teacher;
	}

	private TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	private Integer currPage = 1;//当前页
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	//提供一个查询的方法：
	public String findAll(){
		PageBean<Teacher> pageBean = teacherService.findByPage(currPage);
		//将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
	//跳转到添加教练信息页面的方法：
	public String saveUI(){
		return "saveUI";
	}
	
	//添加教练信息执行的方法：
	public String save(){
		teacherService.save(teacher);
		return "saveSuccess";
	}
	
	//编辑教练信息的执行的方法：
	public String edit(){
		teacher = teacherService.findByIDnumber(teacher.getIDnumber());
		return "editSuccess";
	}
	
	//修改教练信息执行的方法：
	public String update(){
		teacherService.update(teacher);
		return "updateSuccess";
	}
	
	//删除教练信息执行的方法：
	public String delete(){
		teacher = teacherService.findByIDnumber(teacher.getIDnumber());//（1）先查询该对象
		teacherService.delete(teacher);//（2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
	//注入学员的业务层类
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//查询教练所带学员的信息的方法：
	public String queryStu(){
		List<Student> list = studentService.findStuByTeacherID(teacher.getIDnumber());
		//将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().set("list", list);
		return "queryStuSuccess";
	}
	
	//注入车辆的业务层类：
	private VehicleService vehicleService;
	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
		//查询教练所带学员的信息的方法：
		public String queryVehicle(){
			List<Vehicle> list = vehicleService.findVehicleByTeacherID(teacher.getIDnumber());
			//将pageBean存入到值栈中
			ActionContext.getContext().getValueStack().set("list", list);
			return "queryVehicleSuccess";
		}
}

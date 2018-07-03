package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.TestAppointment;
import entity.TestScore;
import service.StudentService;
import service.TestScoreService;

public class TestScoreAction extends ActionSupport implements ModelDriven<TestScore>{

	private TestScore testScore = new TestScore();
	
	@Override
	public TestScore getModel() {
		return testScore;
	}
	
	//注入业务层的类
	private TestScoreService testScoreService;
	
	public void setTestScoreService(TestScoreService testScoreService) {
		this.testScoreService = testScoreService;
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
		testScoreService.save(testScore);
		return "saveSuccess";
	}

	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String findAll() {
		PageBean<TestScore> pageBean = testScoreService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllSuccess";
	}
	
	public String edit() {
		// 查询该条记录
		testScore = testScoreService.findById(testScore.getId());
		return "editSuccess";
	}

	public String update() {
		testScoreService.update(testScore);
		return "updateSuccess";
	}

	public String delete() {
		testScore = testScoreService.findById(testScore.getId());// （1）先查询该对象
		testScoreService.delete(testScore);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
	public String updateStuSubject(){
		testScore = testScoreService.findById(testScore.getId());
		Student student = studentService.findByIDnumber(testScore.getIDnumber());
		if(testScore.getScore() >= 90){
			if(testScore.getSubjectNow().equals("科目一") && student.getSubjectNow().equals("科目一")){
				student.setSubjectNow("科目二");
				studentService.update(student);
				return "updateStuSubject";
			}
			if(testScore.getSubjectNow().equals("科目二") && student.getSubjectNow().equals("科目二")){
				student.setSubjectNow("科目三");
				studentService.update(student);
				return "updateStuSubject";
			}
			if(testScore.getSubjectNow().equals("科目三") && student.getSubjectNow().equals("科目三")){
				student.setSubjectNow("科目四");
				studentService.update(student);
				return "updateStuSubject";
			}
		}
		return NONE;
	}
}

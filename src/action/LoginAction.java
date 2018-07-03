package action;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Administrator;
import entity.Operator;
import entity.Person;
import entity.Student;
import service.LoginService;

public class LoginAction extends ActionSupport{
	private String phoneNum;
	private String password;
	private String identity;//登录角色
	
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	private Person person;
//	private Student student = new Student();
//	private Operator operator = new Operator();
//	private Administrator administrator = new Administrator();
	
	//注入业务层的类
	private LoginService loginService;
	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String execute(){
		if(identity.trim().equals("操作员")){
			//System.out.println("loginAction的方法执行了");
			person = new Operator(phoneNum,password);
			Operator existOperator = loginService.loginOperator(person);
			if(existOperator == null){
				//登录失败
				//this.addActionError("用户名或密码错误！");
				return "failure";
			}else{
				//登录成功
				//ActionContext.getContext().getSejssion().put("existPerson", existOperator);
				if(existOperator.getAuthority().trim().equals("A")){
					ActionContext.getContext().getApplication().put("existPerson", existOperator);
					return "operatorA";
				}else if(existOperator.getAuthority().trim().equals("B")){
					ActionContext.getContext().getApplication().put("existPerson", existOperator);
					return "operatorB";
				}else {
					ActionContext.getContext().getApplication().put("existPerson", existOperator);
					return "operatorC";
				}
			}
		}else if(identity.trim().equals("管理员")){
			//System.out.println("loginAction的方法执行了");
			person = new Administrator(phoneNum,password);
			Administrator existAdministrator = loginService.loginAdministrator(person);
			if(existAdministrator == null){
				//登录失败
				//this.addActionError("用户名或密码错误！");
				return "failure";
			}else{
				//登录成功
				ActionContext.getContext().getApplication().put("existPerson", existAdministrator);
				return "administrator";
			}
		}else{//学员
			//System.out.println("loginAction的方法执行了");
			person = new Student(phoneNum,password);
			Student existStudent = loginService.loginStudent(person);
			if(existStudent == null){
				//登录失败
				//this.addActionError("用户名或密码错误！");
				return "failure";
			}else{
				//登录成功
				ActionContext.getContext().getApplication().put("existPerson", existStudent);
				return "student";
			}
		}
	}
}

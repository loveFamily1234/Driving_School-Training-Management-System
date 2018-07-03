package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Administrator;
import entity.Operator;
import entity.Student;
import service.ModifyPasswordOperatorService;

public class ModifyPasswordOperatorAction extends ActionSupport{
	
	private String firstPassword;
	private String secondPassword;
	//getters和setters方法
	public String getFirstPassword() {
		return firstPassword;
	}
	public void setFirstPassword(String firstPassword) {
		this.firstPassword = firstPassword;
	}
	public String getSecondPassword() {
		return secondPassword;
	}
	public void setSecondPassword(String secondPassword) {
		this.secondPassword = secondPassword;
	}
	//注入业务层类：
	private ModifyPasswordOperatorService modifyPasswordOperatorService;
	
	public void setModifyPasswordOperatorService(ModifyPasswordOperatorService modifyPasswordOperatorService) {
		this.modifyPasswordOperatorService = modifyPasswordOperatorService;
	}
	
	private Operator operator = new Operator();
	//修改操作员密码
	public String updateA(){
		if(firstPassword.equals(secondPassword)){
			
			operator = (Operator)ActionContext.getContext().getApplication().get("existPerson");
			//operator = mpos.findByPhoneNum(operator.getPhoneNum());
			operator.setPassword(firstPassword);
			modifyPasswordOperatorService.update(operator);
			return "updateSuccessA";
		}else{
			//this.addActionError("前后输入的两次新密码不一致！");
			return "fail";
		}
	}
	public String updateB(){
		if(firstPassword.equals(secondPassword)){
			
			operator = (Operator)ActionContext.getContext().getApplication().get("existPerson");
			//operator = mpos.findByPhoneNum(operator.getPhoneNum());
			operator.setPassword(firstPassword);
			modifyPasswordOperatorService.update(operator);
			return "updateSuccessB";
		}else{
			//this.addActionError("前后输入的两次新密码不一致！");
			return "fail";
		}
	}
	public String updateC(){
		if(firstPassword.equals(secondPassword)){
			
			operator = (Operator)ActionContext.getContext().getApplication().get("existPerson");
			//operator = mpos.findByPhoneNum(operator.getPhoneNum());
			operator.setPassword(firstPassword);
			modifyPasswordOperatorService.update(operator);
			return "updateSuccessC";
		}else{
			//this.addActionError("前后输入的两次新密码不一致！");
			return "fail";
		}
	}
	
	private Administrator admin = new Administrator();
	//修改管理员密码
		public String updateAdmin(){
			if(firstPassword.equals(secondPassword)){
				
				admin = (Administrator)ActionContext.getContext().getApplication().get("existPerson");
				admin.setPassword(firstPassword);
				modifyPasswordOperatorService.updateAdmin(admin);
				return "updateAdminSuccess";
			}else{
				//this.addActionError("前后输入的两次新密码不一致！");
				return "fail";
			}
		}
		
		private Student stu = new Student();
		//修改管理员密码
			public String updateStu(){
				if(firstPassword.equals(secondPassword)){
					
					stu = (Student)ActionContext.getContext().getApplication().get("existPerson");
					stu.setPassword(firstPassword);
					modifyPasswordOperatorService.updateStu(stu);
					return "updateStuSuccess";
				}else{
					//this.addActionError("前后输入的两次新密码不一致！");
					return "fail";
				}
			}

}

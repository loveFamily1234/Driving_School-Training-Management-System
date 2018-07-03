package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Operator;
import entity.PageBean;
import entity.Teacher;
import service.OperatorService;

public class OperatorAction extends ActionSupport implements ModelDriven<Operator>{

	private Operator operator = new Operator();
	
	@Override
	public Operator getModel() {
		return operator;
	}
	
	//注入业务层的类
	private OperatorService operatorService;

	public void setOperatorService(OperatorService operatorService) {
		this.operatorService = operatorService;
	}
	
	public String saveUI(){
		return "saveUI";
	}
	
	public String save(){
		operatorService.save(operator);
		return "saveSuccess";
	}
	
	private Integer currPage = 1;//当前页
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	//提供一个查询的方法：
	public String findAll(){
		PageBean<Operator> pageBean = operatorService.findByPage(currPage);
		//将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllSuccess";
	}
	
	public String edit(){
		operator = operatorService.findByPhoneNum(operator.getPhoneNum());
		return "editSuccess";
	}
	
	public String update(){
		operatorService.update(operator);
		return "updateSuccess";
	}
	
	public String findAllAuthority(){
		PageBean<Operator> pageBean = operatorService.findByPage(currPage);
		//将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllAuthoritySuccess";
	}

	public String editAuthority(){
		operator = operatorService.findByPhoneNum(operator.getPhoneNum());
		return "editAuthoritySuccess";
	}
}

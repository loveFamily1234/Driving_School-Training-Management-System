package action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.PageBean;
import entity.Student;
import entity.Teacher;
import service.StudentService;
import service.TeacherService;

/**
 * 学员的action类
 * 
 * @author Administrator
 *
 */
public class StudentAction extends ActionSupport implements ModelDriven<Student>,ServletRequestAware, ServletResponseAware{

	// 模型驱动使用的类
	private Student student = new Student();

	@Override
	public Student getModel() {
		return student;
	}

	// Struts和Spring整合过程中按名称自动注入的业务层类
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	// 保存学员信息的执行的方法：save
	public String save() {
		studentService.save(student);
		return SUCCESS;
	}

	private Integer currPage = 1;// 当前页

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	// 提供一个查询的方法：
	public String findAll() {
		PageBean<Student> pageBean = studentService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String findAll2() {
		PageBean<Student> pageBean = studentService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll2";
	}

	public String findAll3() {
		PageBean<Student> pageBean = studentService.findByPage(currPage);
		// 将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll3";
	}

	// 修改学员当前状态为“已结业”：
	public String modifyStatusToGra() {
		studentService.modifyStatusToGra(student.getIDnumber());
		return "modifyStatusToGraSuccess";
	}

	// 修改学员当前状态为“已退学”：
	public String modifyStatusToLeave() {
		studentService.modifyStatusToLeave(student.getIDnumber());
		return "modifyStatusToLeaveSuccess";
	}
	
	//注入教练的业务层类
	private TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	// 跳转到添加教练信息页面的方法：
	public String saveUI() {
		//查询所有教练
		List<Teacher> list = teacherService.findAll();
		//保存到值栈中，集合用set方法，对象用push方法。
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	// 编辑学员信息的执行的方法：
	public String edit() {
		student = studentService.findByIDnumber(student.getIDnumber());
		//查询所有的教练
		List<Teacher> list = teacherService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}

	// 修改教练信息执行的方法：
	public String update() {
		studentService.update(student);
		return "updateSuccess";
	}

	// 删除教练信息执行的方法：
	public String delete() {
		student = studentService.findByIDnumber(student.getIDnumber());// （1）先查询该对象
		studentService.delete(student);// （2）再进行删除 //(1)(2)可完成级联删除
		return "deleteSuccess";
	}
	
	public String findAll4() {
		student = (Student)ActionContext.getContext().getApplication().get("existPerson");
		List<Student> list = studentService.findByPhoneNum(student.getPhoneNum());
		ActionContext.getContext().getValueStack().set("list", list);
		return "findAll4";
	}
	
	//根据学员身份证号查询学员信息的方法：
	public String findByID(){
		List<Student> list = studentService.findByID(student.getIDnumber());
		ActionContext.getContext().getValueStack().set("list", list);
		return "findByIDSuccess";
	}
	
	/*导出学员数据到Excel*/
	protected HttpServletRequest request = null;  
    protected HttpServletResponse response = null;  
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;		
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;		
	}
	//获取输出流  
    public InputStream getInputExcel()  
    {  
        return (InputStream)request.getAttribute("excelStream");  
    }  
	
	public String exportExcelAll(){
		List<Student> list = studentService.findAll();
		int rows=0;  
        HSSFWorkbook wk = new HSSFWorkbook();  
        HSSFSheet sheet = wk.createSheet("FollowAgentStats");  
        HSSFRow row = sheet.createRow(rows++);  
        int column=0;  
        HSSFCell cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("身份证号");  
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("手机号");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("姓名"); 
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("出生日期"); 
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("性别"); 
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("家庭住址"); 
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("申请驾照类别");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("是否初次申领");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("学费");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("报名日期");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("跟随教练员");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("当前所学科目");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("当前状态");
        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
        cell.setCellValue("结束日期");
        for(int i=0;i<list.size();i++){
	        row = sheet.createRow(rows++);  
	        column=0;  
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getIDnumber());  
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getPhoneNum()); 
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getStuName());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getBirthday());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getGender());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getAddress());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getLicenseType());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getFirstGet());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getFee());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getRegisterDate());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getTeacherID());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getSubjectNow());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getStatusNow());
	        cell = row.createCell(column++,HSSFCell.CELL_TYPE_STRING);  
	        cell.setCellValue(list.get(i).getEndTime());
        }  
        
        try{  
        	wk.close();
            ByteArrayOutputStream out=new ByteArrayOutputStream();  
            wk.write(out);  
            request.setAttribute("excelStream",new ByteArrayInputStream(out.toByteArray()));  
            request.setAttribute("filename", "student.xls");//设置文件名  
            return "exportExcelAll";  
        }catch(Throwable th){  
            th.printStackTrace();  
            System.out.println("无法输出Excel文件");  
            return ERROR;  
        }
	}
}

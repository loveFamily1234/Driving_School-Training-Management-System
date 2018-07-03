package entity;
/**
 * 操作员实体类
 * @author Administrator
 *
 */
public class Operator extends Person{
//	private String phoneNum;//手机号码
//	private String password;//密码
	private String operName;//操作员姓名
	private String birthday;//操作员出生日期
	private String gender;//操作员性别
	private String address;//操作员家庭住址
	private String authority;//权限
	
	public Operator(){
		
	}
	public Operator(String phoneNum,String password){
		super(phoneNum,password);
	}
	//getter和setter方法
	
	public String getOperName() {
		return operName;
	}
	public void setOperName(String operName) {
		this.operName = operName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
}

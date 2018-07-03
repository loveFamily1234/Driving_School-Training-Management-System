package entity;
/**
 * Person抽象类的实体类
 * @author Administrator
 *
 */
public abstract class Person {
	private String phoneNum;//手机号码
	private String password;//密码
	
	public Person(){
		
	}
	public Person(String phoneNum,String password){
		this.phoneNum = phoneNum;
		this.password = password;
	}
	
	//getter和setter方法
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
}

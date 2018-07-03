package entity;
/**
 * 学员实体类
 * @author Administrator
 *
 */
public class Student extends Person{
	private String IDnumber;//身份证号码（主键）
//	private String phoneNum;//手机号码
//	private String password;//密码
	
	private String stuName;//学员姓名
	private String birthday;//学员出生日期
	private String gender;//学员性别
	private String address;//学员家庭住址
	private String licenseType;//申请驾照类型
	private String firstGet;//是否初次申领（初次申领or增驾）
	private double fee;//学费
	private String registerDate;//报名日期
	
	private String teacherID;//学员所跟教练员的ID
	private String subjectNow;//学员目前正在学习的科目
	private String statusNow;//学员目前的状态（未结业、已结业、已退学）
	private String endTime;//学员结束（结业或退校）时间
	
	
	public Student(){
		
	}
	public Student(String phoneNum,String password){
		super(phoneNum,password);
	}
	
	//getter和setter方法
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
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
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getFirstGet() {
		return firstGet;
	}
	public void setFirstGet(String firstGet) {
		this.firstGet = firstGet;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public String getSubjectNow() {
		return subjectNow;
	}
	public void setSubjectNow(String subjectNow) {
		this.subjectNow = subjectNow;
	}
	public String getStatusNow() {
		return statusNow;
	}
	public void setStatusNow(String statusNow) {
		this.statusNow = statusNow;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}

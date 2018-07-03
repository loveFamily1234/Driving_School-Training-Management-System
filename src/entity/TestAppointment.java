package entity;
/**
 * 考试预约的实体类
 * @author Administrator
 *
 */
public class TestAppointment {
	private Integer id;
	private String IDnumber;//学员身份证号
	private String licenseType;//申请驾照类型
	private String subjectNow;//考试科目
	private String timeTest;//考试时间
	private String testAddress;//考试地点
	
	//getters和setters方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getSubjectNow() {
		return subjectNow;
	}
	public void setSubjectNow(String subjectNow) {
		this.subjectNow = subjectNow;
	}
	public String getTimeTest() {
		return timeTest;
	}
	public void setTimeTest(String timeTest) {
		this.timeTest = timeTest;
	}
	public String getTestAddress() {
		return testAddress;
	}
	public void setTestAddress(String testAddress) {
		this.testAddress = testAddress;
	}
}

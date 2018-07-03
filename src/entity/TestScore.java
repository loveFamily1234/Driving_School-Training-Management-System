package entity;
/**
 * 考试成绩的实体类
 * @author Administrator
 *
 */
public class TestScore {
	private Integer id;
	private String IDnumber;//学员身份证号
	private String licenseType;//申请驾照类型
	private String subjectNow;//考试科目
	private Integer score;//考试成绩
	private String timeScore;//取得该成绩时间
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
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getTimeScore() {
		return timeScore;
	}
	public void setTimeScore(String timeScore) {
		this.timeScore = timeScore;
	}
	
}

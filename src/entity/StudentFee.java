package entity;
/**
 * 学生缴费退费记录类
 * @author Administrator
 *
 */
public class StudentFee {
	private Integer id;
	private String IDnumber;//学员身份证号
	private double fee;//学员应缴的费用
	private String reason;//缴费原因
	private String timeFee;//修改日期
	private String state;//当前缴费退费状态（未缴费，已缴费，已退费）
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTimeFee() {
		return timeFee;
	}
	public void setTimeFee(String timeFee) {
		this.timeFee = timeFee;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

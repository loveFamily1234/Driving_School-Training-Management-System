package entity;
/**
 * 车辆开销记录类
 * @author Administrator
 *
 */
public class VehicleFee {
	private Integer id;
	private String plateNumber;/* 格式：适用驾照类型-车牌号（如：C1-冀T55389） */
	private String driver;/* 开车人 */
	private double money;/* 开销多少钱 */
	private String reasonFee;/* 开销的理由 */
	private String timeFee;/* 开销的时间 */
	//getters和setters方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getReasonFee() {
		return reasonFee;
	}
	public void setReasonFee(String reasonFee) {
		this.reasonFee = reasonFee;
	}
	public String getTimeFee() {
		return timeFee;
	}
	public void setTimeFee(String timeFee) {
		this.timeFee = timeFee;
	}
}

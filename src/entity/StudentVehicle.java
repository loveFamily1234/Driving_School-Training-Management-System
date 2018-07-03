package entity;
/**
 * 学员分车的实体类
 * @author Administrator
 *
 */
public class StudentVehicle {
	private String IDnumber;/* 学员身份证号 */
	private String plateNumber;/* 车牌号 */
	private String timeSV;/* 分配时间 */
	
	//getters和setters方法
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getTimeSV() {
		return timeSV;
	}
	public void setTimeSV(String timeSV) {
		this.timeSV = timeSV;
	}
}

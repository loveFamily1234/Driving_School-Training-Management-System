package entity;

public class Vehicle {
	private String plateNumber;//格式：适用驾照类型-车牌号（如：C1-冀T55389）
	private String brand;//车的品牌型号
	private String startTime;//车在该驾校开始使用的时间
	private String teacherID;//学员所跟教练员的ID

	//getters和setters方法
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
}

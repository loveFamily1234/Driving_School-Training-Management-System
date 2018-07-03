package dao;

import entity.VehicleOut;

public interface VehicleOutDao {

	void saveOut(VehicleOut vehicleOut);

	VehicleOut findByPlateNumber(String plateNumber);

	void updateOut(VehicleOut vehicleOut);

	void deleteOut(VehicleOut vehicleOut);

}

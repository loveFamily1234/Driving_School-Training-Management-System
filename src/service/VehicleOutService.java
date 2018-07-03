package service;

import entity.VehicleOut;

public interface VehicleOutService {

	void saveOut(VehicleOut vehicleOut);

	VehicleOut findByPlateNumber(String plateNumber);

	void updateOut(VehicleOut vehicleOut);

	void deleteOut(VehicleOut vehicleOut);

}

package service.impl;

import org.springframework.transaction.annotation.Transactional;

import dao.VehicleDao;
import dao.VehicleOutDao;
import entity.VehicleOut;
import service.VehicleOutService;
@Transactional
public class VehicleOutServiceImpl implements VehicleOutService {

	//注入dao类
	private VehicleOutDao vehicleOutDao;
	
	public void setVehicleOutDao(VehicleOutDao vehicleOutDao) {
		this.vehicleOutDao = vehicleOutDao;
	}

	@Override
	public void saveOut(VehicleOut vehicleOut) {
		vehicleOutDao.saveOut(vehicleOut);
	}

	@Override
	public VehicleOut findByPlateNumber(String plateNumber) {
		return vehicleOutDao.findByPlateNumber(plateNumber);
	}

	@Override
	public void updateOut(VehicleOut vehicleOut) {
		vehicleOutDao.updateOut(vehicleOut);
	}

	@Override
	public void deleteOut(VehicleOut vehicleOut) {
		vehicleOutDao.deleteOut(vehicleOut);
	}

}

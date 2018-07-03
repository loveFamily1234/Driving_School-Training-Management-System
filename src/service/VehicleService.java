package service;

import java.util.List;

import entity.PageBean;
import entity.Vehicle;
import entity.VehicleOut;

public interface VehicleService {

	PageBean<Vehicle> findByPage(Integer currPage);

	void save(Vehicle vehicle);

	Vehicle findByPlateNumber(String plateNumber);

	void update(Vehicle vehicle);

	void delete(Vehicle vehicle);

	List<Vehicle> findVehicleByTeacherID(String iDnumber);

	PageBean<VehicleOut> findByPageOut(Integer currPage);

	List<Vehicle> findAll();

}

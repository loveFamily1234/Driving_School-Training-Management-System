package dao;

import java.util.List;

import entity.Student;
import entity.Vehicle;
import entity.VehicleOut;

public interface VehicleDao {

	int findCount();

	List<Vehicle> findByPage(int begin, int pageSize);

	void save(Vehicle vehicle);

	Vehicle findByPlateNumber(String plateNumber);

	void update(Vehicle vehicle);

	void delete(Vehicle vehicle);

	List<Vehicle> findVehicleByTeacherID(String iDnumber);

	int findCountOut();

	List<VehicleOut> findByPageOut(int begin, int pageSize);

	List<Vehicle> findAll();

}

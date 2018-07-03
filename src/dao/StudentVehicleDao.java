package dao;

import java.util.List;

import entity.StudentVehicle;

public interface StudentVehicleDao {

	void save(StudentVehicle studentVehicle);

	int findCount();

	List<StudentVehicle> findByPage(int begin, int pageSize);

	StudentVehicle findByIDnumber(String iDnumber);

	void update(StudentVehicle studentVehicle);

	void delete(StudentVehicle studentVehicle);

}

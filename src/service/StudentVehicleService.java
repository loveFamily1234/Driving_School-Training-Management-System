package service;

import entity.PageBean;
import entity.StudentVehicle;

public interface StudentVehicleService {

	void save(StudentVehicle studentVehicle);

	PageBean<StudentVehicle> findByPage(Integer currPage);

	StudentVehicle findByIDnumber(String iDnumber);

	void update(StudentVehicle studentVehicle);

	void delete(StudentVehicle studentVehicle);

}

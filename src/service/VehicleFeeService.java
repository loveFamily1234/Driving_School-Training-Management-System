package service;

import entity.PageBean;
import entity.VehicleFee;

public interface VehicleFeeService {

	PageBean<VehicleFee> findByPage(Integer currPage);

	void save(VehicleFee vehicleFee);

	void deleteAll();

	VehicleFee findById(Integer id);

	void delete(VehicleFee vehicleFee);

	
}

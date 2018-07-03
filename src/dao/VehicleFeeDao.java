package dao;

import java.util.List;

import entity.VehicleFee;

public interface VehicleFeeDao {

	int findCount();

	List<VehicleFee> findByPage(int begin, int pageSize);

	void save(VehicleFee vehicleFee);

	void deleteAll();

	VehicleFee findById(Integer id);

	void delete(VehicleFee vehicleFee);


}

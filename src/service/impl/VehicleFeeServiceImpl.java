package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.VehicleFeeDao;
import entity.PageBean;
import entity.Vehicle;
import entity.VehicleFee;
import service.VehicleFeeService;

@Transactional
public class VehicleFeeServiceImpl implements VehicleFeeService {
	
	private VehicleFeeDao vehicleFeeDao;

	public void setVehicleFeeDao(VehicleFeeDao vehicleFeeDao) {
		this.vehicleFeeDao = vehicleFeeDao;
	}

	@Override
	public PageBean<VehicleFee> findByPage(Integer currPage) {
		PageBean<VehicleFee> pageBean = new PageBean<VehicleFee>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = vehicleFeeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<VehicleFee> list = vehicleFeeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	public void save(VehicleFee vehicleFee) {
		vehicleFeeDao.save(vehicleFee);
	}

	@Override
	public void deleteAll() {
		vehicleFeeDao.deleteAll();
	}

	@Override
	public VehicleFee findById(Integer id) {
		return vehicleFeeDao.findById(id);
	}

	@Override
	public void delete(VehicleFee vehicleFee) {
		vehicleFeeDao.delete(vehicleFee);
	}

	
}

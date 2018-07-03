package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.VehicleDao;
import entity.PageBean;
import entity.Vehicle;
import entity.VehicleOut;
import service.VehicleService;
@Transactional
public class VehicleServiceImpl implements VehicleService {

	//注入Dao层类
	private VehicleDao vehicleDao;
	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}


	@Override
	public PageBean<Vehicle> findByPage(Integer currPage) {
		PageBean<Vehicle> pageBean = new PageBean<Vehicle>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = vehicleDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<Vehicle> list = vehicleDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}


	@Override
	public void save(Vehicle vehicle) {
		vehicleDao.save(vehicle);
	}


	@Override
	public Vehicle findByPlateNumber(String plateNumber) {
		return vehicleDao.findByPlateNumber(plateNumber);
	}


	@Override
	public void update(Vehicle vehicle) {
		vehicleDao.update(vehicle);
	}


	@Override
	public void delete(Vehicle vehicle) {
		vehicleDao.delete(vehicle);
	}


	@Override
	//根据教练ID查找教练所用车辆的信息：
	public List<Vehicle> findVehicleByTeacherID(String iDnumber) {
		return vehicleDao.findVehicleByTeacherID(iDnumber);
	}


	@Override
	//查询所有出车记录的业务层类的方法：
	public PageBean<VehicleOut> findByPageOut(Integer currPage) {
		PageBean<VehicleOut> pageBean = new PageBean<VehicleOut>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = vehicleDao.findCountOut();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<VehicleOut> list = vehicleDao.findByPageOut(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}


	@Override
	public List<Vehicle> findAll() {
		return vehicleDao.findAll();
	}

}

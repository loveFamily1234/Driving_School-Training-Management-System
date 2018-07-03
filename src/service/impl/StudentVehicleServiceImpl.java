package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.StudentVehicleDao;
import entity.PageBean;
import entity.StudentVehicle;
import entity.VehicleFee;
import service.StudentVehicleService;

@Transactional
public class StudentVehicleServiceImpl implements StudentVehicleService {

	// 注入dao层类
	private StudentVehicleDao studentVehicleDao;

	public void setStudentVehicleDao(StudentVehicleDao studentVehicleDao) {
		this.studentVehicleDao = studentVehicleDao;
	}

	@Override
	public void save(StudentVehicle studentVehicle) {
		studentVehicleDao.save(studentVehicle);
	}

	@Override
	public PageBean<StudentVehicle> findByPage(Integer currPage) {
		PageBean<StudentVehicle> pageBean = new PageBean<StudentVehicle>();
		// 封装当前页数：
		pageBean.setCurrPage(currPage);
		// 封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		// 封装总记录数：
		int totalCount = studentVehicleDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<StudentVehicle> list = studentVehicleDao.findByPage(begin, pageSize);
		pageBean.setList(list);

		return pageBean;
	}

	@Override
	public StudentVehicle findByIDnumber(String iDnumber) {
		return studentVehicleDao.findByIDnumber(iDnumber);
	}

	@Override
	public void update(StudentVehicle studentVehicle) {
		studentVehicleDao.update(studentVehicle);
	}

	@Override
	public void delete(StudentVehicle studentVehicle) {
		studentVehicleDao.delete(studentVehicle);
	}

}

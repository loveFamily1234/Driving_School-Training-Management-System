package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.StudentFeeDao;
import entity.PageBean;
import entity.StudentFee;
import entity.VehicleFee;
import service.StudentFeeService;
@Transactional
public class StudentFeeServiceImpl implements StudentFeeService {

	//注入dao类
	private StudentFeeDao studentFeeDao;

	public void setStudentFeeDao(StudentFeeDao studentFeeDao) {
		this.studentFeeDao = studentFeeDao;
	}

	@Override
	public void save(StudentFee studentFee) {
		studentFeeDao.save(studentFee);
	}

	@Override
	public PageBean<StudentFee> findByPage(Integer currPage) {
		PageBean<StudentFee> pageBean = new PageBean<StudentFee>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = studentFeeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<StudentFee> list = studentFeeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	public StudentFee findById(Integer id) {
		return studentFeeDao.findById(id);
	}

	@Override
	public void update(StudentFee studentFee) {
		studentFeeDao.update(studentFee);
	}

	@Override
	public void delete(StudentFee studentFee) {
		studentFeeDao.delete(studentFee);
	}

	@Override
	public void deleteAll() {
		studentFeeDao.deleteAll();
	}
	
}

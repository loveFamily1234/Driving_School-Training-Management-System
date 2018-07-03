package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.TestAppointmentDao;
import entity.PageBean;
import entity.StudentVehicle;
import entity.TestAppointment;
import service.TestAppointmentService;
@Transactional
public class TestAppointmentServiceImpl implements TestAppointmentService {
	
	private TestAppointmentDao testAppointmentDao;

	public void setTestAppointmentDao(TestAppointmentDao testAppointmentDao) {
		this.testAppointmentDao = testAppointmentDao;
	}

	@Override
	public void save(TestAppointment testAppointment) {
		testAppointmentDao.save(testAppointment);
	}

	@Override
	public PageBean<TestAppointment> findByPage(Integer currPage) {
		PageBean<TestAppointment> pageBean = new PageBean<TestAppointment>();
		// 封装当前页数：
		pageBean.setCurrPage(currPage);
		// 封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		// 封装总记录数：
		int totalCount = testAppointmentDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<TestAppointment> list = testAppointmentDao.findByPage(begin, pageSize);
		pageBean.setList(list);

		return pageBean;
	}

	@Override
	public TestAppointment findById(Integer id) {
		return testAppointmentDao.findById(id);
	}

	@Override
	public void update(TestAppointment testAppointment) {
		testAppointmentDao.update(testAppointment);
	}

	@Override
	public void delete(TestAppointment testAppointment) {
		testAppointmentDao.delete(testAppointment);
	}
	
}

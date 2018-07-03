package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.TestScoreDao;
import entity.PageBean;
import entity.TestAppointment;
import entity.TestScore;
import service.TestScoreService;
@Transactional
public class TestScoreServiceImpl implements TestScoreService {
	
	private TestScoreDao testScoreDao;

	public void setTestScoreDao(TestScoreDao testScoreDao) {
		this.testScoreDao = testScoreDao;
	}

	@Override
	public void save(TestScore testScore) {
		testScoreDao.save(testScore);
	}

	@Override
	public PageBean<TestScore> findByPage(Integer currPage) {
		PageBean<TestScore> pageBean = new PageBean<TestScore>();
		// 封装当前页数：
		pageBean.setCurrPage(currPage);
		// 封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		// 封装总记录数：
		int totalCount = testScoreDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<TestScore> list = testScoreDao.findByPage(begin, pageSize);
		pageBean.setList(list);

		return pageBean;
	}

	@Override
	public TestScore findById(Integer id) {
		return testScoreDao.findById(id);
	}

	@Override
	public void update(TestScore testScore) {
		testScoreDao.update(testScore);
	}

	@Override
	public void delete(TestScore testScore) {
		testScoreDao.delete(testScore);
	}
	
}

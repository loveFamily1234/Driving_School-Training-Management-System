package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.OperatorDao;
import entity.Operator;
import entity.PageBean;
import entity.Teacher;
import service.OperatorService;
@Transactional
public class OperatorServiceImpl implements OperatorService {
	
	private OperatorDao operatorDao;

	public void setOperatorDao(OperatorDao operatorDao) {
		this.operatorDao = operatorDao;
	}

	@Override
	public void save(Operator operator) {
		operatorDao.save(operator);
	}

	@Override
	public PageBean<Operator> findByPage(Integer currPage) {
		PageBean<Operator> pageBean = new PageBean<Operator>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = operatorDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<Operator> list = operatorDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	public Operator findByPhoneNum(String phoneNum) {
		return operatorDao.findByPhoneNum(phoneNum);
	}

	@Override
	public void update(Operator operator) {
		operatorDao.update(operator);
	}

	@Override
	public void delete(Operator operator) {
		operatorDao.delete(operator);
	}
	
	
}

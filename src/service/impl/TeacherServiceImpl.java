package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.TeacherDao;
import entity.PageBean;
import entity.Student;
import entity.Teacher;
import service.TeacherService;
@Transactional
public class TeacherServiceImpl implements TeacherService {

	private TeacherDao teacherDao;
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}


	@Override
	public PageBean<Teacher> findByPage(Integer currPage) {
		PageBean<Teacher> pageBean = new PageBean<Teacher>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = teacherDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<Teacher> list = teacherDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}


	@Override
	public void save(Teacher teacher) {
		teacherDao.save(teacher);
	}


	@Override
	//业务层根据教练IDnumber查询教练信息的方法：
	public Teacher findByIDnumber(String iDnumber) {
		return teacherDao.findByIDnumber(iDnumber);
	}


	@Override
	//业务层修改教练信息的方法：
	public void update(Teacher teacher) {
		teacherDao.update(teacher);
	}


	@Override
	//业务层删除教练信息的方法：
	public void delete(Teacher teacher) {
		teacherDao.delete(teacher);
	}


	@Override
	//查询所有教练的方法：
	public List<Teacher> findAll() {
		return teacherDao.findAll();
	}

}

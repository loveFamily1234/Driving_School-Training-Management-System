package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.StudentDao;
import entity.PageBean;
import entity.Student;
import service.StudentService;

/**
 * 学员报名的业务层的实现类
 * @author Administrator
 *
 */
@Transactional
public class StudentServiceImpl implements StudentService{
	//业务层注入DAO的类
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	//业务层保存学员信息的方法
	public void save(Student student){
		studentDao.save(student);
	}

	@Override
	//分页查询部分的方法
	public PageBean<Student> findByPage(Integer currPage) {
		PageBean<Student> pageBean = new PageBean<Student>();
		//封装当前页数：
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数：
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		//封装总记录数：
		int totalCount = studentDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数：
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据：
		int begin = (currPage - 1) * pageSize;
		List<Student> list = studentDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	//业务层根据学员ID查询学员的方法
	public void modifyStatusToGra(String iDnumber) {
		studentDao.modifyStatusToGra(iDnumber);
	}

	@Override
	public void modifyStatusToLeave(String iDnumber) {
		studentDao.modifyStatusToLeave(iDnumber);
	}

	@Override
	public Student findByIDnumber(String iDnumber) {
		return studentDao.findByIDnumber(iDnumber);
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

	@Override
	public void delete(Student student) {
		studentDao.delete(student);
	}

	@Override
	//根据教练ID查找教练所带学员的信息：
	public List<Student> findStuByTeacherID(String iDnumber) {
		return studentDao.findStuByTeacherID(iDnumber);
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public List<Student> findByPhoneNum(String phoneNum) {
		return studentDao.findByPhoneNum(phoneNum);
	}

	@Override
	public List<Student> findByID(String iDnumber) {
		return studentDao.findByID(iDnumber);
	}
}

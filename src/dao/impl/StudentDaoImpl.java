package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.StudentDao;
import entity.Student;

/**
 * 学员报名的dao的实现类
 * @author Administrator
 *
 */
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao{
	
	@Override
	//保存学员报名信息的方法
	public void save(Student student){
//		System.out.println("dao类的save方法执行了。。。");
		this.getHibernateTemplate().save(student);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from Student";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	//分页查询学员
	public List<Student> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
		List<Student> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	//Dao中根据学员ID查询学员的方法
	public void modifyStatusToGra(String iDnumber) {
		Student student = this.getHibernateTemplate().get(Student.class, iDnumber);
		student.setStatusNow("已结业");
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date currentTime = new java.util.Date();
		String time = simpleDateFormat.format(currentTime).toString();
		student.setEndTime(time);
		this.getHibernateTemplate().update(student);
	}

	@Override
	public void modifyStatusToLeave(String iDnumber) {
		Student student = this.getHibernateTemplate().get(Student.class, iDnumber);
		student.setStatusNow("已退学");
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date currentTime = new java.util.Date();
		String time = simpleDateFormat.format(currentTime).toString();
		student.setEndTime(time);
		this.getHibernateTemplate().update(student);
	}

	@Override
	public Student findByIDnumber(String iDnumber) {
		return this.getHibernateTemplate().get(Student.class, iDnumber);
	}

	@Override
	public void update(Student student) {
		this.getHibernateTemplate().update(student);
	}

	@Override
	public void delete(Student student) {
		this.getHibernateTemplate().delete(student);
	}

	@Override
	//Dao中根据教练ID查询教练所带学生的信息：
	public List<Student> findStuByTeacherID(String iDnumber) {
		String hql = "from Student where teacherID = ?";
		List<Student> list = this.getHibernateTemplate().find(hql, iDnumber);
		return list;
	}

	@Override
	public List<Student> findAll() {
		return this.getHibernateTemplate().find("from Student");
	}

	@Override
	public List<Student> findByPhoneNum(String phoneNum) {
		String hql = "from Student where phoneNum = ?";
		return this.getHibernateTemplate().find(hql,phoneNum);
	}

	@Override
	public List<Student> findByID(String iDnumber) {
		String hql = "from Student where IDnumber = ?";
		List<Student> list = this.getHibernateTemplate().find(hql, iDnumber);
		return list;
	}
}

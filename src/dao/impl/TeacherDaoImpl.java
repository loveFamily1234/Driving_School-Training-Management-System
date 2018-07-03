package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.TeacherDao;
import entity.Student;
import entity.Teacher;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

	@Override
	public int findCount() {
		String hql = "select count(*) from Teacher";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	//分页查询教练信息
	public List<Teacher> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Teacher.class);
		List<Teacher> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(Teacher teacher) {
		this.getHibernateTemplate().save(teacher);
	}

	@Override
	//DAO中根据教练IDnumber查询教练信息的方法：
	public Teacher findByIDnumber(String iDnumber) {
		return this.getHibernateTemplate().get(Teacher.class, iDnumber);
	}

	@Override
	//DAO中修改教练信息的方法：
	public void update(Teacher teacher) {
		this.getHibernateTemplate().update(teacher);
	}

	@Override
	//DAO中删除教练信息的方法：
	public void delete(Teacher teacher) {
		this.getHibernateTemplate().delete(teacher);
	}

	@Override
	//Dao中查询所有教练的方法：
	public List<Teacher> findAll() {
		return this.getHibernateTemplate().find("from Teacher");
	}

}

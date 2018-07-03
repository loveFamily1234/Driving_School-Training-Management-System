package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StudentFeeDao;
import entity.StudentFee;
import entity.VehicleFee;

public class StudentFeeDaoImpl extends HibernateDaoSupport implements StudentFeeDao {

	@Override
	public void save(StudentFee studentFee) {
		this.getHibernateTemplate().save(studentFee);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from StudentFee";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<StudentFee> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(StudentFee.class);
		List<StudentFee> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public StudentFee findById(Integer id) {
		return this.getHibernateTemplate().get(StudentFee.class, id);
	}

	@Override
	public void update(StudentFee studentFee) {
		this.getHibernateTemplate().update(studentFee);
	}

	@Override
	public void delete(StudentFee studentFee) {
		this.getHibernateTemplate().delete(studentFee);
	}

	@Override
	public void deleteAll() {
		DetachedCriteria criteria = DetachedCriteria.forClass(StudentFee.class);
		List<VehicleFee> list = this.getHibernateTemplate().findByCriteria(criteria);
		this.getHibernateTemplate().deleteAll(list);
	}

}

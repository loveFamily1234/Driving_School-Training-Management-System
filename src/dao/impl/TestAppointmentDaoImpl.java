package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.TestAppointmentDao;
import entity.StudentVehicle;
import entity.TestAppointment;

public class TestAppointmentDaoImpl extends HibernateDaoSupport implements TestAppointmentDao {

	@Override
	public void save(TestAppointment testAppointment) {
		this.getHibernateTemplate().save(testAppointment);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from TestAppointment";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<TestAppointment> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(TestAppointment.class);
		List<TestAppointment> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public TestAppointment findById(Integer id) {
		return this.getHibernateTemplate().get(TestAppointment.class, id);
	}

	@Override
	public void update(TestAppointment testAppointment) {
		this.getHibernateTemplate().update(testAppointment);
	}

	@Override
	public void delete(TestAppointment testAppointment) {
		this.getHibernateTemplate().delete(testAppointment);
	}

}

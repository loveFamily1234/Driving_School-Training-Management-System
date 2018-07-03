package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StudentVehicleDao;
import entity.StudentVehicle;

public class StudentVehicleDaoImpl extends HibernateDaoSupport implements StudentVehicleDao {

	@Override
	public void save(StudentVehicle studentVehicle) {
		this.getHibernateTemplate().save(studentVehicle);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from StudentVehicle";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<StudentVehicle> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(StudentVehicle.class);
		List<StudentVehicle> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public StudentVehicle findByIDnumber(String iDnumber) {
		return this.getHibernateTemplate().get(StudentVehicle.class, iDnumber);
	}

	@Override
	public void update(StudentVehicle studentVehicle) {
		this.getHibernateTemplate().update(studentVehicle);
	}

	@Override
	public void delete(StudentVehicle studentVehicle) {
		this.getHibernateTemplate().delete(studentVehicle);
	}

}

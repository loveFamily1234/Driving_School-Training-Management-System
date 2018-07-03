package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.VehicleFeeDao;
import entity.VehicleFee;

public class VehicleFeeDaoImpl extends HibernateDaoSupport implements VehicleFeeDao {

	@Override
	public int findCount() {
		String hql = "select count(*) from VehicleFee";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<VehicleFee> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(VehicleFee.class);
		List<VehicleFee> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public void save(VehicleFee vehicleFee) {
		this.getHibernateTemplate().save(vehicleFee);
	}

	@Override
	public void deleteAll() {
		DetachedCriteria criteria = DetachedCriteria.forClass(VehicleFee.class);
		List<VehicleFee> list = this.getHibernateTemplate().findByCriteria(criteria);
		this.getHibernateTemplate().deleteAll(list);
	}

	@Override
	public VehicleFee findById(Integer id) {
		return this.getHibernateTemplate().get(VehicleFee.class, id);
	}

	@Override
	public void delete(VehicleFee vehicleFee) {
		this.getHibernateTemplate().delete(vehicleFee);
	}


}

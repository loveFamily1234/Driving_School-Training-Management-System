package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.VehicleOutDao;
import entity.VehicleOut;

public class VehicleOutDaoImpl extends HibernateDaoSupport implements VehicleOutDao {

	@Override
	public void saveOut(VehicleOut vehicleOut) {
		this.getHibernateTemplate().save(vehicleOut);
	}

	@Override
	public VehicleOut findByPlateNumber(String plateNumber) {
		return this.getHibernateTemplate().get(VehicleOut.class, plateNumber);
	}

	@Override
	public void updateOut(VehicleOut vehicleOut) {
		this.getHibernateTemplate().update(vehicleOut);
	}

	@Override
	public void deleteOut(VehicleOut vehicleOut) {
		this.getHibernateTemplate().delete(vehicleOut);
	}

}

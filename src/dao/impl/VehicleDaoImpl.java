package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.VehicleDao;
import entity.Student;
import entity.Vehicle;
import entity.VehicleOut;

public class VehicleDaoImpl extends HibernateDaoSupport implements VehicleDao {

	@Override
	public int findCount() {
		String hql = "select count(*) from Vehicle";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Vehicle> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Vehicle.class);
		List<Vehicle> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(Vehicle vehicle) {
		this.getHibernateTemplate().save(vehicle);
	}

	@Override
	public Vehicle findByPlateNumber(String plateNumber) {
		return this.getHibernateTemplate().get(Vehicle.class, plateNumber);
	}

	@Override
	public void update(Vehicle vehicle) {
		this.getHibernateTemplate().update(vehicle);
	}

	@Override
	public void delete(Vehicle vehicle) {
		this.getHibernateTemplate().delete(vehicle);
	}

	@Override
	public List<Vehicle> findVehicleByTeacherID(String iDnumber) {
		String hql = "from Vehicle where teacherID = ?";
		List<Vehicle> list = this.getHibernateTemplate().find(hql,iDnumber);
		return list;
	}

	@Override
	public int findCountOut() {
		String hql = "select count(*) from VehicleOut";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<VehicleOut> findByPageOut(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(VehicleOut.class);
		List<VehicleOut> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public List<Vehicle> findAll() {
		return this.getHibernateTemplate().find("from Vehicle");
	}

}

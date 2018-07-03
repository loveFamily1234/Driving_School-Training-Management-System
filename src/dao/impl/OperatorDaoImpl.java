package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.OperatorDao;
import entity.Operator;
import entity.Teacher;

public class OperatorDaoImpl extends HibernateDaoSupport implements OperatorDao {

	@Override
	public void save(Operator operator) {
		this.getHibernateTemplate().save(operator);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from Operator";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Operator> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Operator.class);
		List<Operator> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public Operator findByPhoneNum(String phoneNum) {
		return this.getHibernateTemplate().get(Operator.class, phoneNum);
	}

	@Override
	public void update(Operator operator) {
		this.getHibernateTemplate().update(operator);
	}

	@Override
	public void delete(Operator operator) {
		this.getHibernateTemplate().delete(operator);
	}

}

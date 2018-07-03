package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.TestScoreDao;
import entity.TestAppointment;
import entity.TestScore;

public class TestScoreDaoImpl extends HibernateDaoSupport implements TestScoreDao {

	@Override
	public void save(TestScore testScore) {
		this.getHibernateTemplate().save(testScore);
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from TestScore";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<TestScore> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(TestScore.class);
		List<TestScore> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public TestScore findById(Integer id) {
		return this.getHibernateTemplate().get(TestScore.class, id);
	}

	@Override
	public void update(TestScore testScore) {
		this.getHibernateTemplate().update(testScore);
	}

	@Override
	public void delete(TestScore testScore) {
		this.getHibernateTemplate().delete(testScore);
	}

}

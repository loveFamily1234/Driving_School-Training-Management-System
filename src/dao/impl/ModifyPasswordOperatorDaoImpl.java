package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ModifyPasswordOperatorDao;
import entity.Administrator;
import entity.Operator;
import entity.Student;

public class ModifyPasswordOperatorDaoImpl extends HibernateDaoSupport implements ModifyPasswordOperatorDao {

	@Override
	public Operator findByPhoneNum(String phoneNum) {
		return this.getHibernateTemplate().get(Operator.class, phoneNum);
	}

	@Override
	public void update(Operator operator) {
		this.getHibernateTemplate().update(operator);
	}

	@Override
	public void updateAdmin(Administrator admin) {
		this.getHibernateTemplate().update(admin);
	}

	@Override
	public void updateStu(Student stu) {
		this.getHibernateTemplate().update(stu);
	}

}

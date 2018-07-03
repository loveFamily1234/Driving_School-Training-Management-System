package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.LoginDao;
import entity.Administrator;
import entity.Operator;
import entity.Person;
import entity.Student;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	/*
	 * DAO中根据用户名和密码查询用户的方法：
	 */
	@Override
	public Student findByUsernameAndPasswordStudent(Person person) {
		String hql = "from Student where phoneNum = ? and password = ?";
		List<Student> list = this.getHibernateTemplate().find(hql,person.getPhoneNum(),person.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Operator findByUsernameAndPasswordOperator(Person person) {
		String hql = "from Operator where phoneNum = ? and password = ?";
		List<Operator> list = this.getHibernateTemplate().find(hql,person.getPhoneNum(),person.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Administrator findByUsernameAndPasswordAdministrator(Person person) {
		String hql = "from Administrator where phoneNum = ? and password = ?";
		List<Administrator> list = this.getHibernateTemplate().find(hql,person.getPhoneNum(),person.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

}

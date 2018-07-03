package service.impl;

import dao.LoginDao;
import entity.Administrator;
import entity.Operator;
import entity.Person;
import entity.Student;
import service.LoginService;

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	/*
	 * 业务层的登录的方法：
	 */
	public Student loginStudent(Person person) {
		Student existStudent = loginDao.findByUsernameAndPasswordStudent(person);
		return existStudent;
	}

	@Override
	public Operator loginOperator(Person person) {
		Operator existOperator = loginDao.findByUsernameAndPasswordOperator(person);
		return existOperator;
	}

	@Override
	public Administrator loginAdministrator(Person person) {
		Administrator existAdministrator = loginDao.findByUsernameAndPasswordAdministrator(person);
		return existAdministrator;
	}
	
}

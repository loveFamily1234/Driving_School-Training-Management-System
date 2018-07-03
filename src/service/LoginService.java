package service;

import entity.*;
/**
 * 登录的业务层的接口
 * @author Administrator
 *
 */
public interface LoginService {

	Student loginStudent(Person person);
	Operator loginOperator(Person person);
	Administrator loginAdministrator(Person person);

}

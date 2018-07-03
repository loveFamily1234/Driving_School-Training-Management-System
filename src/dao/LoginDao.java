package dao;

import entity.Administrator;
import entity.Operator;
import entity.Person;
import entity.Student;

public interface LoginDao {


	Student findByUsernameAndPasswordStudent(Person person);

	Operator findByUsernameAndPasswordOperator(Person person);

	Administrator findByUsernameAndPasswordAdministrator(Person person);
	

}

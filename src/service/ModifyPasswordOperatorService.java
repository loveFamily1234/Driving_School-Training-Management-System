package service;

import entity.Administrator;
import entity.Operator;
import entity.Student;

public interface ModifyPasswordOperatorService {

	Operator findByPhoneNum(String phoneNum);

	void update(Operator operator);

	void updateAdmin(Administrator admin);

	void updateStu(Student stu);

}

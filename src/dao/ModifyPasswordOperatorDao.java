package dao;

import entity.Administrator;
import entity.Operator;
import entity.Student;

public interface ModifyPasswordOperatorDao {

	Operator findByPhoneNum(String phoneNum);

	void update(Operator operator);

	void updateAdmin(Administrator admin);

	void updateStu(Student stu);

}

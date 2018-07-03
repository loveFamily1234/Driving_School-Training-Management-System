package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	void save(Student student);

	int findCount();

	List<Student> findByPage(int begin, int pageSize);

	void modifyStatusToGra(String iDnumber);

	void modifyStatusToLeave(String iDnumber);

	Student findByIDnumber(String iDnumber);

	void update(Student student);

	void delete(Student student);

	List<Student> findStuByTeacherID(String iDnumber);

	List<Student> findAll();

	List<Student> findByPhoneNum(String phoneNum);

	List<Student> findByID(String iDnumber);

}

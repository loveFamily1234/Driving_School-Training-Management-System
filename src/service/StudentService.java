package service;

import java.util.List;

import entity.PageBean;
import entity.Student;

public interface StudentService {
	void save(Student student);

	PageBean<Student> findByPage(Integer currPage);

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

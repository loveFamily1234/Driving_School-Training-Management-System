package dao;

import java.util.List;

import entity.Teacher;

public interface TeacherDao {

	int findCount();

	List<Teacher> findByPage(int begin, int pageSize);

	void save(Teacher teacher);

	Teacher findByIDnumber(String iDnumber);

	void update(Teacher teacher);

	void delete(Teacher teacher);

	List<Teacher> findAll();

}

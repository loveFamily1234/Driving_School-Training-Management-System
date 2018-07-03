package service;

import java.util.List;

import entity.PageBean;
import entity.Teacher;

public interface TeacherService {

	PageBean<Teacher> findByPage(Integer currPage);

	void save(Teacher teacher);

	Teacher findByIDnumber(String iDnumber);

	void update(Teacher teacher);

	void delete(Teacher teacher);

	List<Teacher> findAll();

}

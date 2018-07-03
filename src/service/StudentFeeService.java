package service;

import entity.PageBean;
import entity.StudentFee;

public interface StudentFeeService {

	void save(StudentFee studentFee);

	PageBean<StudentFee> findByPage(Integer currPage);

	StudentFee findById(Integer id);

	void update(StudentFee studentFee);

	void delete(StudentFee studentFee);

	void deleteAll();

}

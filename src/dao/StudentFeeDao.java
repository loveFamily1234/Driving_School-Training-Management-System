package dao;

import java.util.List;

import entity.StudentFee;

public interface StudentFeeDao {

	void save(StudentFee studentFee);

	int findCount();

	List<StudentFee> findByPage(int begin, int pageSize);

	StudentFee findById(Integer id);

	void update(StudentFee studentFee);

	void delete(StudentFee studentFee);

	void deleteAll();

}

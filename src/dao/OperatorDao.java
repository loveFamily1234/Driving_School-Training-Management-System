package dao;

import java.util.List;

import entity.Operator;

public interface OperatorDao {

	void save(Operator operator);

	int findCount();

	List<Operator> findByPage(int begin, int pageSize);

	Operator findByPhoneNum(String phoneNum);

	void update(Operator operator);

	void delete(Operator operator);

}

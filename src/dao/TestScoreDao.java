package dao;

import java.util.List;

import entity.TestScore;

public interface TestScoreDao {

	void save(TestScore testScore);

	int findCount();

	List<TestScore> findByPage(int begin, int pageSize);

	TestScore findById(Integer id);

	void update(TestScore testScore);

	void delete(TestScore testScore);

}

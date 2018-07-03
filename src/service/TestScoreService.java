package service;

import entity.PageBean;
import entity.TestScore;

public interface TestScoreService {

	void save(TestScore testScore);

	PageBean<TestScore> findByPage(Integer currPage);

	TestScore findById(Integer id);

	void update(TestScore testScore);

	void delete(TestScore testScore);

}

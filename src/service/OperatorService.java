package service;

import entity.Operator;
import entity.PageBean;

public interface OperatorService {

	void save(Operator operator);

	PageBean<Operator> findByPage(Integer currPage);

	Operator findByPhoneNum(String phoneNum);

	void update(Operator operator);

	void delete(Operator operator);

}

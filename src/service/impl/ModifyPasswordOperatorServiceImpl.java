package service.impl;

import org.springframework.transaction.annotation.Transactional;

import dao.ModifyPasswordOperatorDao;
import entity.Administrator;
import entity.Operator;
import entity.Student;
import service.ModifyPasswordOperatorService;
@Transactional
public class ModifyPasswordOperatorServiceImpl implements ModifyPasswordOperatorService {

	//注入dao类
	private ModifyPasswordOperatorDao modifyPasswordOperatorDao;

	public void setModifyPasswordOperatorDao(ModifyPasswordOperatorDao modifyPasswordOperatorDao) {
		this.modifyPasswordOperatorDao = modifyPasswordOperatorDao;
	}

	@Override
	public Operator findByPhoneNum(String phoneNum) {
		return modifyPasswordOperatorDao.findByPhoneNum(phoneNum);
	}

	@Override
	public void update(Operator operator) {
		modifyPasswordOperatorDao.update(operator);
	}

	@Override
	public void updateAdmin(Administrator admin) {
		modifyPasswordOperatorDao.updateAdmin(admin);
	}

	@Override
	public void updateStu(Student stu) {
		modifyPasswordOperatorDao.updateStu(stu);
	}

}

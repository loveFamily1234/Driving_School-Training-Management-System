package service;

import entity.PageBean;
import entity.TestAppointment;

public interface TestAppointmentService {

	void save(TestAppointment testAppointment);

	PageBean<TestAppointment> findByPage(Integer currPage);

	TestAppointment findById(Integer id);

	void update(TestAppointment testAppointment);

	void delete(TestAppointment testAppointment);

}

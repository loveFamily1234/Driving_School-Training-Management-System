package dao;

import java.util.List;

import entity.TestAppointment;

public interface TestAppointmentDao {

	void save(TestAppointment testAppointment);

	int findCount();

	List<TestAppointment> findByPage(int begin, int pageSize);

	TestAppointment findById(Integer id);

	void update(TestAppointment testAppointment);

	void delete(TestAppointment testAppointment);

}

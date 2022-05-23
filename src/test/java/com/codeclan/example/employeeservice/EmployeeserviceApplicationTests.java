package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee stephanie = new Employee("Stephanie", 27, "stephanie@email.com");
		employeeRepository.save(stephanie);
		Employee claire = new Employee("Claire", 23, "claire@email.com");
		employeeRepository.save(claire);
		Employee tom = new Employee("Tom", 17, "tom@email.com");
		employeeRepository.save(tom);
		Employee ethan = new Employee("Ethan", 27, "ethan@email.com");
		employeeRepository.save(ethan);

	}

}

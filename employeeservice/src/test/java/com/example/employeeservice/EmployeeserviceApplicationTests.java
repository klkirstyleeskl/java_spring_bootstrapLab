package com.example.employeeservice;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee employee1 = new Employee("Jeffrey", 21, 123543,
				"hotstuff92@gmail.com");
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Pauline", 85, 119903,
				"hotstuff93@gmail.com");
		employeeRepository.save(employee2);
		Employee employee3 = new Employee("Samuel", 22, 122222,
				"hotstuff94@gmail.com");
		employeeRepository.save(employee3);


	}

}

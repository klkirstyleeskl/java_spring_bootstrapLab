package com.example.employeeservice;

import com.example.employeeservice.models.Department;
import com.example.employeeservice.models.Employee;
import com.example.employeeservice.repositories.DepartmentRepository;
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

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void canCreateEmployeeAndDepartment(){
		Department department = new Department("hot buns");
		departmentRepository.save(department);

		Employee employee = new Employee("Jeffrey", "Classic", 45, 3343,
				"hotstuff93@gmail.com", department);
		employeeRepository.save(employee);

	}

}

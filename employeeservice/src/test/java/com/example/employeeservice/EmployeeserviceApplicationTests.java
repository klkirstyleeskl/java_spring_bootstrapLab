package com.example.employeeservice;

import com.example.employeeservice.models.Department;
import com.example.employeeservice.models.Employee;
import com.example.employeeservice.models.Project;
import com.example.employeeservice.repositories.DepartmentRepository;
import com.example.employeeservice.repositories.EmployeeRepository;
import com.example.employeeservice.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public  void canAddEmployeeToProject(){
		Department department = new Department("hot buns");
		departmentRepository.save(department);

		Employee employee = new Employee("Jeffrey", "Classic", 45, 3343,
				"hotstuff93@gmail.com", department);
		employeeRepository.save(employee);

		Project project = new Project("Operation Bun in Oven", 2 );
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

	}

	@Test
	public void canAddMultipleEmployeesToProjects(){
		Department department = new Department("hot buns");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jeffrey", "Classic", 45, 3343,
				"hotstuff93@gmail.com", department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Jeffrey", "Classic", 45, 3343,
				"hotstuff93@gmail.com", department);
		employeeRepository.save(employee2);

		Employee employee3 = new Employee("Jeffrey", "Classic", 45, 3343,
				"hotstuff93@gmail.com", department);
		employeeRepository.save(employee3);

		Project project = new Project("Operation Bun in Oven", 2 );
		projectRepository.save(project);

		project.addEmployee(employee1);
		project.addEmployee(employee2);
		project.addEmployee(employee3);
		projectRepository.save(project);


	}

}

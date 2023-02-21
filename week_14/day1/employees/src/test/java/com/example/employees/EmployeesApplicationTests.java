package com.example.employees;

import com.example.employees.models.Employee;
import com.example.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepo;
	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveAEmployee(){
		Employee myEmployee = new Employee("Jim Halpert", 32, 249, "jimH@dundermiflin.com");
		employeeRepo.save(myEmployee);

	}


}

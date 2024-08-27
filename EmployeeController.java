package com.example.demo;

import java.util.ArrayList;
import java.util.List; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

@RestController
public class EmployeeController {
	Employee emp = new Employee(101, "Santosh", 10.5);
	 
 	@GetMapping("/emp")
 	public String emp() {
       	return emp.toString();
 	}
 	@GetMapping("/empObj")
 	public Employee empObj() {
       	return emp;
 	}
 
 	@GetMapping("/empJson")
 	public String empJson() {
       	ObjectMapper mapper = new ObjectMapper();
       	try {
            	String empJson = mapper.writeValueAsString(emp);
            	return empJson;
       	} catch (JsonProcessingException e) {
            	e.printStackTrace();
       	}
       	return null;
 	}

 	@RequestMapping("/empList")
 	public List<Employee> getAllEmployees() {
       	List<Employee> employeeList = new ArrayList<>();
       	employeeList.add(new Employee(101, "Santosh", 10.5));
       	employeeList.add(new Employee(102, "Ganesh", 10.6));
       	employeeList.add(new Employee(103, "Shiva", 10.7));
       	return employeeList;
 	}

}

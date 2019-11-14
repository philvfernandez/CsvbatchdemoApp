package com.spring.howto.config;

import org.springframework.batch.item.ItemProcessor;

import com.spring.howto.model.Employee;

public class DBLogProcessor implements ItemProcessor<Employee, Employee> {

	public Employee process(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inserting employee : " + employee);
		return employee;
	}
}

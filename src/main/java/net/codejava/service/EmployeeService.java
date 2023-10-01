package net.codejava.service;

import java.util.List;

import net.codejava.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public List<Employee> saveEmployee(List<Employee> employee);
	public List<Employee> getEmployee();
	//public String getEmployees();
	public Employee getEmployeeById(int id);
	public Employee getEmployeeByName(String name);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(Employee employee);
}

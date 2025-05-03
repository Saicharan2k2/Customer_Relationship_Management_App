package in.demo.sai.service;

import java.util.List;
import in.demo.sai.model.Employee;

public interface IEmployeeService {
	public List<Employee> findAllEmployees();
	public Employee saveEmployee(Employee employee);
	public Employee findEmployeeById(Integer id);
	public void deleteEmployeeById(Integer id);
}

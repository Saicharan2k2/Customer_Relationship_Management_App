package in.demo.sai.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.demo.sai.dao.IEmployeeRepository;
import in.demo.sai.exception.EmployeeNotFoundException;
import in.demo.sai.model.Employee;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) repo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		Employee employee = repo.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Record not exists with the id:: " + id));

		return employee;
	}

	@Override
	public void deleteEmployeeById(Integer id) {

		Employee employee = repo.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Record not exists with the id:: " + id));

		repo.delete(employee);
	}
}

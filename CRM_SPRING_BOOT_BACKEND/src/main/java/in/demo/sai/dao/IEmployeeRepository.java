package in.demo.sai.dao;

import org.springframework.data.repository.CrudRepository;

import in.demo.sai.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}

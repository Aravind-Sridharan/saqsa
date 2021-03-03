package com.intelizest.projectIZ.Repository;

import com.intelizest.projectIZ.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

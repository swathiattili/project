package employee.cox.employee.service;

import employee.cox.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee addEmpl(Employee employee);

    public List<Employee> getempl();

    public Optional<Employee> listById(int employeeId);

    public void deleteEmpl(int employeeId);

    public Employee updateEmpl(int employeeId, Employee employee);
}

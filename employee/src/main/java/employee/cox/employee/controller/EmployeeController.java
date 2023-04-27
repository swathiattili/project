package employee.cox.employee.controller;


import employee.cox.employee.model.Department;
import employee.cox.employee.model.Employee;
import employee.cox.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/addemp")
    public Employee addEmpl(@RequestBody Employee employee) {
        return employeeService.addEmpl(employee);
    }

    @GetMapping("/listempl")
    public List<Employee> getEmpl() {
        Department[] employeees =restTemplate.getForObject("http://localhost:9002/department/{id}", Department[].class);
        return employeeService.getempl();
    }

    @GetMapping("/viewbyid/{employeeId}")
    public Optional<Employee> listById(@PathVariable("employeeId") int employeeId) {

        return employeeService.listById(employeeId);
    }


    @DeleteMapping("/delete/{employeeId}")
    public String deleteEmpl(@PathVariable("employeeId") int employeeId) {

        employeeService.deleteEmpl(employeeId);
        return "data deleted successfully";
    }

    @PutMapping("/update/{employeeId}")
    public Employee updateEmpl(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) {

        return employeeService.updateEmpl(employeeId, employee);
    }

}

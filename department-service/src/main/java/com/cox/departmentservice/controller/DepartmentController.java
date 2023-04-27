package com.cox.departmentservice.controller;

import com.cox.departmentservice.model.Department;
import com.cox.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {

    @Autowired
     DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department saveDepartment = departmentService.saveDepartment(department);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
//                departmentService.addDep(department);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") int departmentId){
       Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
//        departmentService.getDepartmentById(departmentId);
    }

}
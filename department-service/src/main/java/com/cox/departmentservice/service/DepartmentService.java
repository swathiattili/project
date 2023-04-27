package com.cox.departmentservice.service;

import com.cox.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

    public Department getDepartmentById(int departmentId);

   // public List<Department> getDep();
}

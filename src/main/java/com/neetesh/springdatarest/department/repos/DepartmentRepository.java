package com.neetesh.springdatarest.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.neetesh.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

	

}

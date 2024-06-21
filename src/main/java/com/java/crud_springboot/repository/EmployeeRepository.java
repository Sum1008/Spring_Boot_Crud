package com.java.crud_springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.crud_springboot.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 
}
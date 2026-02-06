package com.IT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IT.Entity.Employee;
@Repository
public interface Employee_Repository extends JpaRepository<Employee, Integer> {

}

package com.app1.application1.repository;

import com.app1.application1.entity.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee1,Long> {
}

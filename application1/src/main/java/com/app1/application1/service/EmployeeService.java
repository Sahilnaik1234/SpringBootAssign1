package com.app1.application1.service;

import com.app1.application1.entity.Employee1;
import com.app1.application1.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee1> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee1 getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("employee not found with id"+id));
    }
    public Employee1 saveEmployee(Employee1 employee){
        return employeeRepository.save(employee);
    }

}

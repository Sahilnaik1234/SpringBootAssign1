package com.app1.application1.controller;

import com.app1.application1.entity.Employee1;
import com.app1.application1.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {
private final EmployeeService employeeService;
@GetMapping
public ResponseEntity<List<Employee1>> getAllEmployees(){
    return ResponseEntity.ok(employeeService.getAllEmployees());
}
@PostMapping
    public ResponseEntity<Employee1> createEmployee(@RequestBody Employee1 employee1){
    return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.saveEmployee(employee1));
}
@GetMapping("/{id}")
    public ResponseEntity<Employee1> getEmployeeById(@PathVariable Long id){
    return ResponseEntity.ok(employeeService.getEmployeeById(id));
}
}

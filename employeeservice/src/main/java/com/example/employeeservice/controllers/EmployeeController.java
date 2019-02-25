package com.example.employeeservice.controllers;


import com.example.employeeservice.models.Employee;
import com.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @DeleteMapping
    public void deleteAllEmployees(){
        employeeRepository.deleteAll();
    }

    @DeleteMapping("{id}")
    public void deleteByid(@PathVariable Long id){
       employeeRepository.deleteById(id);

    }

    




}

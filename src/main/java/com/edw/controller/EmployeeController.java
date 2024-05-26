package com.edw.controller;

import com.edw.model.Employee;
import com.edw.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *     com.edw.controller.EmployeeController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Mei 2024 20:24
 */
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

}

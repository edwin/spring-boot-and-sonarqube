package com.edw.model;

import javax.persistence.*;

/**
 * <pre>
 *     com.edw.model.Employee
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Mei 2024 20:20
 */
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String employeeName;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

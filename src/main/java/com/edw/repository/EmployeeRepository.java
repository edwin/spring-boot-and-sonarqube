package com.edw.repository;

import com.edw.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 *     com.edw.repository.EmployeeRepository
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Mei 2024 20:22
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

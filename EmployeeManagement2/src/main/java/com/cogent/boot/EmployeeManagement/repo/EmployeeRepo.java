/**
 * 
 */
package com.cogent.boot.EmployeeManagement.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.cogent.boot.EmployeeManagement.entity.Employee;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}

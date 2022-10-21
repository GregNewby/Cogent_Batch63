/**
 * 
 */
package com.cogent.boot.EmployeeManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.EmployeeManagement.entity.Payroll;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer>{

}

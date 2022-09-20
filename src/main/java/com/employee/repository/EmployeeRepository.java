package com.employee.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer>{
	
	@Transactional()
	@Modifying()
    @Query(value="update employeeinfo e set e.address = ?1, e.city = ?2, e.email = ?3, e.employee_full_name = ?4, e.job_title = ?5, e.pecphone_number = ?6, e.pecrelationship = ?7, e.phone_number = ?8, e.primary_emergency_contact = ?9, e.secphone_number = ?10, e.secrelationship = ?11, e.secondary_emergency_contact = ?12, e.state = ?13 where EmployeeID = ?14 ", nativeQuery = true)
    int update(String Address,String City,String Email,String EmployeeFullName,String JobTitle,String PECPhoneNumber,String PECRelationship,String PhoneNumber,String PrimaryEmergencyContact,String SECPhoneNumber,String SECRelationship,String SecondaryEmergencyContact,String State,int EmployeeID);
}

package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeModel;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/create")
	public EmployeeModel create(@RequestBody EmployeeModel employeeModel)
	{
		return employeeService.Create(employeeModel);
	}

	@GetMapping("/read")
	public List<EmployeeModel> read(EmployeeModel employeeModel)
	{
		System.out.println(employeeService.Read(employeeModel));
		return employeeService.Read(employeeModel);
	}

	@PutMapping("/update/{EmployeeID}")
	public int update(@PathVariable int EmployeeID,@RequestBody EmployeeModel employeeModel)
	{
		return employeeService.Update(EmployeeID,employeeModel);
	}
	
	@DeleteMapping("/delete/{EmployeeID}")
	public EmployeeModel delete(@PathVariable int EmployeeID)
	{
		return employeeService.Delete(employeeService.Findbyid(EmployeeID));
	}

	@GetMapping("/findbyid/{EmployeeID}")
	public EmployeeModel findbyid(@PathVariable int EmployeeID)
	{
		return employeeService.Findbyid(EmployeeID);
	}
}


//Completed initial=Laxmi, SECPhoneNumber=9218740211, SECRelationship=Mother], 
//EmployeeModel [EmployeeID=79386, EmployeeFullName=phani, JobTitle=Employee, PhoneNumber=901834682, Email=phani@gmail.com, Address=DVP, City=RJY, State=Andhra pradesh, PrimaryEmergencyContact=balu, PECPhoneNumber=728164918, PECRelationship=Father, SecondaryEmergencyContact=Laxmi, SECPhoneNumber=9218740211, SECRelationship=Mother]]Hibernate: select employeemo0_.employeeid as employee1_0_, employeemo0_.address as address2_0_, employeemo0_.city as city3_0_, employeemo0_.email as email4_0_, employeemo0_.employee_full_name as employee5_0_, employeemo0_.job_title as job_titl6_0_, employeemo0_.pecphone_number as pecphone7_0_, employeemo0_.pecrelationship as pecrelat8_0_, employeemo0_.phone_number as phone_nu9_0_, employeemo0_.primary_emergency_contact as primary10_0_, employeemo0_.secphone_number as secphon11_0_, employeemo0_.secrelationship as secrela12_0_, employeemo0_.secondary_emergency_contact as seconda13_0_, employeemo0_.state as state14_0_ from employeeinfo employeemo0_

package com.employee.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.EmployeeModel;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	List<EmployeeModel> list;
	
	public EmployeeModel Create(EmployeeModel employeeModel)
	{	
		employeeModel.setEmployeeID((int)new Random().nextInt(90001));
		return employeeRepository.save(employeeModel);
	}

	public List<EmployeeModel> Read(EmployeeModel employeeModel)
	{
		return employeeRepository.findAll();
	}
	
	public int Update(int EmployeeID,EmployeeModel employeeModel)
	{
		return employeeRepository.update(employeeModel.getAddress(),employeeModel.getCity(),
		employeeModel.getEmail(),employeeModel.getEmployeeFullName(),employeeModel.getJobTitle(),
		employeeModel.getPECPhoneNumber(),employeeModel.getPECRelationship(),employeeModel.getPhoneNumber(),
		employeeModel.getPrimaryEmergencyContact(),employeeModel.getSECPhoneNumber(),employeeModel.getSECRelationship(),
		employeeModel.getSecondaryEmergencyContact(),employeeModel.getState(),EmployeeID);
	}

	public EmployeeModel Delete(EmployeeModel employeeModel)
	{
		employeeRepository.delete(employeeModel);
		return null;
	}
	
	public EmployeeModel Findbyid(int EmpID)
	{
		return employeeRepository.findById(EmpID).get();
	}
}

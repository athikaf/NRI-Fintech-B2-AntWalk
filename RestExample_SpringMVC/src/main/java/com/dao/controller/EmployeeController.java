package com.dao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.dao.model.EmployeeModel;

@RestController
public class EmployeeController{
	
	
	@RequestMapping(value="/getAllEmployees",method=RequestMethod.POST)
	public List<EmployeeModel> getAllEmployees(){
		
		return employees();
	}
	
	
	@RequestMapping(value="/getEmployeeById/{id}",method=RequestMethod.POST)
	public EmployeeModel getEmployeeById(@RequestParam int id) {
		
		List<EmployeeModel> emps = employees();
		
		for(EmployeeModel emp : emps) {
			if(emp.getEmployeeId()==id) {
				return emp;
			}
		}
		return null;
	}
	
	
	public List<EmployeeModel> employees(){
		
		EmployeeModel emp1 = new EmployeeModel(101,"Manish","Delhi","Engineer");
		EmployeeModel emp2 = new EmployeeModel(102,"Manisha","Delhi","System Engineer");
		EmployeeModel emp3 = new EmployeeModel(103,"Anish","Jaipur","Software Engineer");
		EmployeeModel emp4 = new EmployeeModel(104,"Aanisha","Delhi","Product Engineer");
		EmployeeModel emp5 = new EmployeeModel(105,"Tanish","Delhi","Engineer");
		
		List<EmployeeModel> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		
		return emps;
		
	}
	
}
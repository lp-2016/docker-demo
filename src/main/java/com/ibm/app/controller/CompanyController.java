package com.ibm.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.app.entity.Company;
import com.ibm.app.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/services")
	public List<Company> list() {
		return companyService.listAll();
	}
	
	@GetMapping("/service/getById/{id}")
	public Company getById(@PathVariable int id) {
		
		return companyService.getById(id);
	}
	
	@DeleteMapping("/service/delete/{id}")
	public int deleteById(@PathVariable int id) {
		
		return companyService.delete(id);
	}
	
	
	@PostMapping("/service/save")
	public int saveCompany(Company company) {
		
		return companyService.save(company);
	}
	
	@PutMapping("/service/update")
	public int updateCompany(Company company) {
		
		return companyService.update(company);
	}
	
}

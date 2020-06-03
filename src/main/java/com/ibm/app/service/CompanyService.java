package com.ibm.app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ibm.app.dao.CompanyDao;
import com.ibm.app.entity.Company;

@Service
public class CompanyService {

	@Resource
	private CompanyDao companyDao;

	
	public List<Company> listAll() {
		return companyDao.listAll();
		
	}


	public Company getById(int id) {
		return companyDao.getById(id);
	}


	public int delete(int id) {
		return companyDao.delete(id);
	}


	public int save(Company company) {
		return companyDao.save(company);
	}
	
	public int update(Company company) {
		return companyDao.update(company);
	}
	
}

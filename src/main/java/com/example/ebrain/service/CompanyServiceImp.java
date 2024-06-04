package com.example.ebrain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ebrain.entity.Company;
import com.example.ebrain.repository.CompanyRepository;

@Service
public class CompanyServiceImp implements CompanyService {
	
	@Autowired
	CompanyRepository companyRepo;

	@Override
	public Company post(Company company) {
		
		return companyRepo.save(company) ;
	}

	@Override
	public Optional<Company> getCompany(int id) {
		return companyRepo.findById(id) ;
	}

	@Override
	public Company update(Company company) {
		Optional<Company> optional=companyRepo.findById(company.getId());
		Company company1= optional.get();
		company1.setId(company.getId());
		company1.setName(company.getName());
		company1.setPlace(company.getPlace());
		company1.setBike(company.getBike());
		return companyRepo.save(company1);
	}

	

	
}

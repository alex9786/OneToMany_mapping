package com.example.ebrain.service;

import java.util.Optional;

import com.example.ebrain.entity.Company;

public interface CompanyService {

	Company post(Company company);

	Optional<Company> getCompany(int id);

	Company update(Company company);

	

}
package com.example.ebrain.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebrain.entity.Company;
import com.example.ebrain.service.CompanyService;

@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	CompanyService comService;
	
	@PostMapping("/post")
	public Company post(@RequestBody Company company) {
		return comService.post(company);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Company> getCompany(@PathVariable ("id")int id){
		return comService.getCompany(id);
	}
	
	@PutMapping("/update")
	public Company update(@RequestBody Company company) {
		return comService.update(company);
	}
}

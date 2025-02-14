package com.example.ebrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebrain.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}

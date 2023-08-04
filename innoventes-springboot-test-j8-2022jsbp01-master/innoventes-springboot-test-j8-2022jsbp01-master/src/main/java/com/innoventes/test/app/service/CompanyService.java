package com.innoventes.test.app.service;

import java.util.List;
import java.util.*;

import com.innoventes.test.app.entity.Company;
import com.innoventes.test.app.exception.ValidationException;
//import com.innoventes.test.app.service.impl.Optional;

public interface CompanyService {

	List<Company> getAllCompanies();

	Company addCompany(Company company) throws ValidationException;

	Company updateCompany(Long id, Company company) throws ValidationException;
	
	void deleteCompany(Long id);

	Company getCompanyById(Long id);

	Optional<Company> getCompanyByCompanyCode(String companyCode);

	Company updateCompany1(Company existingCompany);

	Company updateCompany(Company company);
	
	
}
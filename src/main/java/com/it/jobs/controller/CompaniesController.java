package com.it.jobs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.jobs.constant.Constant;
import com.it.jobs.model.Company;
import com.it.jobs.response.CompanyAddResponse;
import com.it.jobs.response.CompanyListResponse;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

	@PostMapping("getList")
	public ResponseEntity<CompanyListResponse> getCompanies() {
		try {
			List<Company> companyList = new ArrayList<Company>();
			Company company1 = new Company();
			Company company2 = new Company();
			Company company3 = new Company();

			company1.setId(1);
			company1.setCompany("Santander");

			company2.setId(2);
			company2.setCompany("10x");

			company3.setId(3);
			company3.setCompany("Ford");

			companyList.add(company1);
			companyList.add(company2);
			companyList.add(company3);

			CompanyListResponse response = new CompanyListResponse(Constant.COMPANY_LIST_RETURNED, companyList);
			return new ResponseEntity<CompanyListResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			CompanyListResponse response = new CompanyListResponse(Constant.ERROR_IN_LISTING_COMPANY, null);
			return new ResponseEntity<CompanyListResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("add")
	public ResponseEntity<CompanyAddResponse> addCompany(@RequestBody Company company) {
		try {
			CompanyAddResponse response = new CompanyAddResponse(Constant.COMPANY_ADDED);
			return new ResponseEntity<CompanyAddResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			CompanyAddResponse response = new CompanyAddResponse(Constant.ERROR_IN_ADDING_COMPANY);
			return new ResponseEntity<CompanyAddResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

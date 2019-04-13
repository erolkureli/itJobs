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
import com.it.jobs.model.InputCompany;
import com.it.jobs.model.Title;
import com.it.jobs.response.TitleListResponse;

@RestController
@RequestMapping("/titles")
public class TitlesController {
	
	@PostMapping("getList")
	public ResponseEntity<TitleListResponse> getTitle(@RequestBody InputCompany company) {
		
		try{
		   List<Title> titleList = new ArrayList<Title>();
		   Title title1 = new Title(1, "Developer");
		   Title title2 = new Title(2, "Senior Developer");
		   Title title3 = new Title(3, "Business Analyst");
		   
		   titleList.add(title1);
		   titleList.add(title2);
		   titleList.add(title3);
		   
		   TitleListResponse response = new TitleListResponse(Constant.TITLE_LIST_RETURNED, titleList);
		   return new ResponseEntity<TitleListResponse>(response, HttpStatus.OK);
		}catch (Exception e) {
			TitleListResponse response = new TitleListResponse(Constant.ERROR_IN_LISTING_TITLE, null);
			return new ResponseEntity<TitleListResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

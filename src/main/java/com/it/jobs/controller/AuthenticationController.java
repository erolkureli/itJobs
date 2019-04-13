package com.it.jobs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.jobs.constant.Constant;
import com.it.jobs.model.LoginInfo;
import com.it.jobs.model.RegisterInfo;
import com.it.jobs.model.ResetInfo;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
	
	@PostMapping("login")
	public ResponseEntity<String> login(@RequestBody LoginInfo loginInfo) {
		try{
		   return new ResponseEntity<String>(Constant.LOGIN_SUCCESSFULL, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(Constant.LOGIN_FAILURE, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("register")
	public ResponseEntity<String> register(@RequestBody RegisterInfo registerInfo) {
		try{
		   return new ResponseEntity<String>(Constant.REGISTER_SUCCESSFULL, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(Constant.REGISTER_FAILURE, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("resetPasword")
	public ResponseEntity<String> resetPasword(@RequestBody ResetInfo resetInfo) {
		try{
		   return new ResponseEntity<String>(Constant.RESET_SUCCESSFULL, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(Constant.RESET_FAILURE, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

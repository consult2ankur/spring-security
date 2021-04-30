package com.tcs.Springsecurity.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SController
{  
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@GetMapping(path="/login")
	public ResponseEntity<String>home()
	{
		return new ResponseEntity<String>("service is up",HttpStatus.OK);
	}
	@RequestMapping("/hello")
	public ResponseEntity<String>hello(){
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}
	
	@RequestMapping("/logout")
	public ResponseEntity<String>LogoutPage(){
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}
	
	}


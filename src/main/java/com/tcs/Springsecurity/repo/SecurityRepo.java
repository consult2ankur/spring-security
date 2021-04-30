package com.tcs.Springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Springsecurity.model.person;



public interface SecurityRepo extends JpaRepository<person,Integer>  {

	person findByUsername(String username);
	
}

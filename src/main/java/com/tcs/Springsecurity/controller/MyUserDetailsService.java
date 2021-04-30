package com.tcs.Springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.Springsecurity.model.person;
import com.tcs.Springsecurity.repo.SecurityRepo;
@Service
public class MyUserDetailsService implements UserDetailsService {
  
	@Autowired
	private SecurityRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		person p=repo.findByUsername(username);
		if(p==null)
		{
			throw new UsernameNotFoundException("user not found ");
		}
		return new UserPrinciple(p);
	}

}

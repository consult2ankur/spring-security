package com.tcs.Springsecurity.controller;

import java.util.Collection;
import java.util.Collections;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tcs.Springsecurity.model.person;

public class UserPrinciple implements UserDetails{
    
	
	private person p;
	
	
	public UserPrinciple(person p) {
		super();
		this.p = p;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return Collections.singleton(new SimpleGrantedAuthority("User"));
	}

	@Override
	public String getPassword() 
	{
		// TODO Auto-generated method stub
		return p.getPass();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return p.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

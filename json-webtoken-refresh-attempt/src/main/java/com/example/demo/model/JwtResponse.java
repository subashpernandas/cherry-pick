package com.example.demo.model;

import java.util.List;

public class JwtResponse {

	private String jwt;
	
	private String username;
	
	private Long id;
	
	private String pasword;
	
	private String email;
	
	private List<String> roles;

	public JwtResponse(String jwt, Long id, String username, String email, String pasword, List<String> roles) {
		this.jwt = jwt;
		this.id = id;
		this.username = username;
		this.pasword = pasword;
		this.email = email;
		this.roles = roles;
	}

	public JwtResponse() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}

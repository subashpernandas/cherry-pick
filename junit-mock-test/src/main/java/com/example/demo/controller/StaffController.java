package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Staff;
import com.example.demo.repo.StaffRepo;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired private StaffRepo staffRepo;
	
	@PostMapping("/post")
	public Staff saveStaffDetails(@RequestBody Staff staff) {
		return staffRepo.save(staff);
	}
	
	@GetMapping("/get")
	public String getStaffDetails() {
		return "hello";
	}
}

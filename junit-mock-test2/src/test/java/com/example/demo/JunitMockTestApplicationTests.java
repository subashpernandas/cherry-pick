package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.StaffController;
import com.example.demo.model.Staff;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class JunitMockTestApplicationTests {

	@InjectMocks StaffController staffController;
	
	private MockMvc mockMvc;
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Before
	public void setUpDone() {
		mockMvc = MockMvcBuilders.standaloneSetup(staffController).build();
	}
	
	@Test
	public void testHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/get")).andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("hello"));
	}
	/*
	 * @Test public void addStaffDetails() throws Exception { Staff staff = new
	 * Staff(); staff.setName("subash pernandas"); staff.setStaffName("savari");
	 * staff.setAge(28); String jsonStaff = objectMapper.writeValueAsString(staff);
	 * MvcResult mvcResult =
	 * mockMvc.perform(post("/staff/post").content(jsonStaff).contentType(MediaType.
	 * APPLICATION_JSON_VALUE)) .andExpect(status().isOk()).andReturn(); String
	 * resultant = mvcResult.getResponse().getContentAsString(); Staff staffDetails
	 * = objectMapper.readValue(resultant, Staff.class);
	 * assertEquals(staffDetails.getName(), staff.getName()); }
	 */

}

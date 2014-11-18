package com.food.foodfinder;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.food.foodfinder.repositories.FoodFacilitiesRepositoryCustom;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class FoodFacilitiesControllerTest {

	@Autowired
	@Qualifier("foodFacilitiesRepo")
	private FoodFacilitiesRepositoryCustom repository;
	
	@Autowired 
	WebApplicationContext webContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webContext).build();
	}
		
	@Test
    public void testFindByApplicant() throws Exception
    {
		String applicant = "Cupkates Bakery, LLC";
		MvcResult result = mockMvc.perform(get("/search/{applicant}", applicant)).andReturn();
		System.out.println(result.getResponse().getContentAsString());
    }
	
	@Test
    public void testGetFoodFacilities() throws Exception
    {
		double latitude = 37.7901490737255;
		double longitude = -122.398658184604;
		double maxdistance = 5;
		
		mockMvc.perform(get("/search/{latitude}/{longitude}/{maxdistance}", latitude, longitude, maxdistance)).
			andExpect(status().isOk());
    }
}

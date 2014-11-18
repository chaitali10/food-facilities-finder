package com.food.foodfinder.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.food.foodfinder.model.*;
import com.food.foodfinder.repositories.FoodFacilitiesRepositoryCustom;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FoodFacilitiesController {
	
	public static final Double distance = 5.0d;
	//private static final Logger logger = LoggerFactory.getLogger(FoodFacilitiesController.class);
	
	@Autowired
	@Qualifier("foodFacilitiesRepo")
	private FoodFacilitiesRepositoryCustom repository;
	
		
	@RequestMapping(method = RequestMethod.GET, value = "/search/{applicant}")
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getApplicant(@PathVariable String applicant)
	{
		return new ModelAndView("home", "foodFacilities", repository.findByApplicant(applicant));
	}
		
	@RequestMapping(method = RequestMethod.GET, value = "/search/{latitude}/{longitude}/{maxdistance}")
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getFoodFacilities(@PathVariable double latitude, @PathVariable double longitude, @PathVariable double maxdistance)
	{
		return new ModelAndView("home", "foodFacilities", repository.findByLocation(latitude, longitude, maxdistance));
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleAllException(Exception ex) {
 
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}

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
	
	@RequestMapping(method = RequestMethod.GET, value = "/search") //, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getFoodFacilities()
	{
		return new ModelAndView("home", "foodFacilities", repository.getAll());
	}
		
	@RequestMapping(method = RequestMethod.GET, value = "/search/{latitude}/{longitude}/{maxdistance}") //, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getFoodFacilities(@PathVariable double latitude, @PathVariable double longitude, @PathVariable double maxDistance)
	{
		return new ModelAndView("home", "foodFacilities", repository.findByLocation(latitude, longitude, maxDistance));
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleAllException(Exception ex) {
 
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/locationId/{locationId}") //, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(value = HttpStatus.OK)
	public ModelAndView getFoodFacilities(@PathVariable long locationId)
	{
		FoodFacilities temp = repository.findByLocationId(locationId);
		return new ModelAndView("home", "foodFacilities", repository.findByLocationId(locationId));
	}

	*/
}

package com.food.foodfinder;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
//@EnableAutoConfiguration
public class FoodFinder {

	public static void main(String[] args) {
		SpringApplication.run(FoodFinder.class, args);
	}

}

package com.food.foodfinder.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.food.foodfinder.model.FoodFacilities;

@Repository
public interface FoodFacilitiesRepositoryCustom {
	List<FoodFacilities> findByApplicant(String applicant);
	List<FoodFacilities> findByLocation(double lattitude, double longitude, double maxDistance);
}

package com.food.foodfinder.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.MongoOperations;

import com.food.foodfinder.model.FoodFacilities;

import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class FoodFacilitiesRepositoryIml implements FoodFacilitiesRepositoryCustom{
	
	//private Logger logger;
	
	private MongoOperations mongoOps;
	
	@Autowired
	public FoodFacilitiesRepositoryIml(MongoOperations mongoOps)
	{
		Assert.notNull(mongoOps, "Mongo operations is null");
		this.mongoOps = mongoOps;
	}
	
	public List<FoodFacilities> findByApplicant(String applicant) {
		Criteria criteria = new Criteria().where("applicant").is(applicant);
		return mongoOps.find(Query.query(criteria), FoodFacilities.class);
	}
	
	public List<FoodFacilities> findByLocation(double lattitude, double longitude, double maxdistance) {
		
		Criteria criteria = new Criteria().near(new Point(lattitude, longitude)).maxDistance(maxdistance);
		return mongoOps.find(new Query(criteria), FoodFacilities.class);
	}
}

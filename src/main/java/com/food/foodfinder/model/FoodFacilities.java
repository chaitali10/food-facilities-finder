package com.food.foodfinder.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="sf")
public class FoodFacilities {
	
	@Field("locationid")
	private long locationId;
	
	@Field("Applicant")
	private String applicant;
	
	@Field("FacilityType")
	private String facilityType;
	
	private Long cnn;
	
	@Field("LocationDescription")
	private String locationDescription;
	
	@Field("Address")
	private String address;
	private String blockLot;
	private String block;
	private String lot;
	private String permit;
	
	@Field("Status")
	private String status;
	
	@Field("FoodItems")
	private String foodItems;
	
	@Field("X")
	private Long x;
	
	@Field("Y")
	private Long y;
	
	@Field("Latitude")
	private BigDecimal latitude;
	
	@Field("Longitude")
	private BigDecimal longitude;
	
	@Field("Schedule")
	private String schedule;
	
	@Field("NOISent")
	private String noiSent;
	
	@Field("Approved")
	private String approved;
	
	@Field("Received")
	private String received;
	
	@Field("PriorPermit")
	private boolean priorPermit;
	
	@Field("ExpirationDate")
	private String expirationDate;
	//private List<Position> location;
	
	public long getLocationid() {
		return locationId;
	}
	public void setLocationid(long locationid) {
		this.locationId = locationid;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public Long getCnn() {
		return cnn;
	}
	public void setCnn(Long cnn) {
		this.cnn = cnn;
	}
	public String getLocationDescription() {
		return locationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBlockLot() {
		return blockLot;
	}
	public void setBlockLot(String blockLot) {
		this.blockLot = blockLot;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}
	public Long getX() {
		return x;
	}
	public void setX(Long x) {
		this.x = x;
	}
	public Long getY() {
		return y;
	}
	public void setY(Long y) {
		this.y = y;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getNoiSent() {
		return noiSent;
	}
	public void setNoiSent(String noiSent) {
		this.noiSent = noiSent;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getReceived() {
		return received;
	}
	public void setReceived(String received) {
		this.received = received;
	}
	public boolean isPriorPermit() {
		return priorPermit;
	}
	public void setPriorPermit(boolean priorPermit) {
		this.priorPermit = priorPermit;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	/*public List<Position> getLocation() {
		return location;
	}
	public void setLocation(List<Position> location) {
		this.location = location;
	}*/
}

package com.food.foodfinder.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sf")
public class FoodFacilities {
	
	//@Id
	private long locationid;
	private String applicant;
	private String facilityType;
	private long cnn;
	private String locationDescription;
	private String address;
	private String blockLot;
	private long block;
	private String lot;
	private String permit;
	private String status;
	private String foodItems;
	private long x;
	private long y;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String schedule;
	private Date noiSent;
	private Date approved;
	private Date received;
	private boolean priorPermit;
	private Date expirationDate;
	//private List<Position> location;
	
	public long getLocationid() {
		return locationid;
	}
	public void setLocationid(long locationid) {
		this.locationid = locationid;
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
	public long getCnn() {
		return cnn;
	}
	public void setCnn(long cnn) {
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
	public long getBlock() {
		return block;
	}
	public void setBlock(long block) {
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
	public long getX() {
		return x;
	}
	public void setX(long x) {
		this.x = x;
	}
	public long getY() {
		return y;
	}
	public void setY(long y) {
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
	public Date getNoiSent() {
		return noiSent;
	}
	public void setNoiSent(Date noiSent) {
		this.noiSent = noiSent;
	}
	public Date getApproved() {
		return approved;
	}
	public void setApproved(Date approved) {
		this.approved = approved;
	}
	public Date getReceived() {
		return received;
	}
	public void setReceived(Date received) {
		this.received = received;
	}
	public boolean isPriorPermit() {
		return priorPermit;
	}
	public void setPriorPermit(boolean priorPermit) {
		this.priorPermit = priorPermit;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	/*public List<Position> getLocation() {
		return location;
	}
	public void setLocation(List<Position> location) {
		this.location = location;
	}*/
}

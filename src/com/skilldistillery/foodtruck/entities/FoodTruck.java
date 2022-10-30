package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private String name;
	private int id;
	private String foodType;
	private int rating;

	
public FoodTruck() {}

public FoodTruck( String name, String foodType, int rating, int id) {
	this.name = name;
	this.foodType = foodType;
	this.rating = rating;
	this.nextTruckId = nextTruckId;
	this.id = id;
}

public static int getNextTruckId() {
	return nextTruckId;
}

public static void setNextTruckId(int nextTruckId) {
	FoodTruck.nextTruckId = nextTruckId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
	
public String toString() {
	return "Food Truck ID: " + id + "\t Food Truck Name: " + name + "\t Food Type: " + 
			foodType + "\t Rating: " + rating;
	


}
}
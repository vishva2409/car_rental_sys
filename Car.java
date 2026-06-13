package com.car_rental_sys;

public class Car {
	private String carId;
	private String carModel;
	private String carBrand;
	private double basePricePerDay;
	private boolean isAvailable;
	
	public Car(String carId, String carModel, String carBrand, double basePricePerDay) {
		this.carId = carId;
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable = true;
	}
	

	public String getCarId() {
		return carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public double getBasePricePerDay() {
		return basePricePerDay;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
		public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public void setBasePricePerDay(double basePricePerDay) {
		this.basePricePerDay = basePricePerDay;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	public void rent() {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}
	public double calculatePrice(int rentalDays) {
		return basePricePerDay*rentalDays;
	}
	
}

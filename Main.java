package com.car_rental_sys;

public class Main {

	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();
		Car carl =new Car( "C001",  "Toyota",  "Camry",  68.8); 
		Car car2= new Car ( "C002",  "Honda",  "Accord",  70.8);
		Car car3 =new Car ( "C003",  "Mahindra",  "Thar",  150.0);
		rentalSystem.addCar(carl);
		rentalSystem.addCar (car2);
		rentalSystem.addCar(car3);
		rentalSystem.menu();
}
}

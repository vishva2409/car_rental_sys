# car_rental_sys
--> Car Rental System (Java Console Application)

**Overview**

--> The Car Rental System is a simple console-based Java application that allows users to rent and return cars. The project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, abstraction, and object interaction.

--> The system maintains records of available cars, customers, and rental transactions. Users can view available cars, rent a car for a specific number of days, calculate rental costs, and return rented vehicles.

--> This project is designed for beginners who want to understand how multiple classes work together in a real-world application.

**Features**
View available cars
Rent a car for a specified number of days
Automatic rental cost calculation
Create and manage customer records
Return rented cars
Track rental transactions
Menu-driven console interface
Input validation for unavailable or invalid cars.

**Technologies Used**
Java
Object-Oriented Programming (OOP)
Collections Framework (ArrayList)
Java Scanner Class
Console-Based User Interface

**Project Structure**

CarRentalSystem
│
├── Car.java
├── Customer.java
├── Rental.java
├── CarRentalSystem.java
└── Main.java

**Sample Execution**

===== Car Rental System =====
1. Rent a Car
2. Return a Car
3. Exit
Enter your choice: 1

==== Rent a Car ====

Enter your name: vishva

Available Cars:
CarId  CarBrand CarModel 
-------------------------
C001   Camry     Toyota
C002   Accord     Honda
C003   Thar     Mahindra

Enter the car ID you want to rent: C002
Enter the number of days for rental: 6

== Rental Information ==

Customer ID:CUS1
Customer Name:vishva
Car:Accord Honda
Rental Days:6
Total Price: $424.80

Confirm rental (Y/N): y

Car rented successfully.

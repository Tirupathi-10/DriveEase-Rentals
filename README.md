# DriveEase Rentals

A console-based **Vehicle Rental Management System** developed using **Core Java and Object-Oriented Programming (OOP)** principles. The application provides a structured rental workflow for cars and bikes, including customer validation, vehicle availability, rental selection, and automated rental cost calculation.

## Overview

**DriveEase Rentals** is designed to demonstrate practical implementation of Java OOP concepts through a real-world vehicle rental use case.

The application allows customers to:

* Select a vehicle category — Car or Bike
* Enter and validate customer details
* Verify driving licence information
* Check vehicle availability
* Select a vehicle from the available models
* Specify the rental duration
* Calculate rental charges and security deposit
* Display the final rental summary

## Key Features

* 🚗 **Car Rental** — Multiple car models with different rental rates and seating capacities
* 🏍️ **Bike Rental** — Multiple bike models with different rental rates
* 👤 **Customer Validation** — Age, phone number, and driving licence validation
* ✅ **Availability Check** — Validates whether the selected vehicle is available
* 💰 **Rental Calculation** — Calculates total rental cost based on duration
* 🔐 **Security Deposit** — Applies a fixed security deposit to the rental
* 📋 **Rental Summary** — Displays complete booking and payment details
* ⚠️ **Input Validation** — Handles invalid vehicle selections and customer details

## Technology Stack

| Technology | Usage                        |
| ---------- | ---------------------------- |
| Java       | Application development      |
| Core Java  | Programming fundamentals     |
| OOP        | Application architecture     |
| Java Regex | Phone and licence validation |
| Scanner    | Console-based user input     |

## OOP Concepts Implemented

### Interface

The `Rental` interface defines the common operations required for all rental types.

```java
public interface Rental {
    int getAge();
    boolean isPhoneNumber();
    boolean isLicenceValid();
    boolean checkAvailability();
    double calculateRent();
    double securityDeposit();
}
```

### Abstract Class

`RentalOperations` implements the common rental functionality and acts as the base class for different vehicle types.

```java
public abstract class RentalOperations implements Rental {
    public abstract double calculateRent();
}
```

### Inheritance

`Car` and `Bike` inherit common functionality from `RentalOperations`.

```java
public class Car extends RentalOperations {
    // Car-specific implementation
}
```

```java
public class Bike extends RentalOperations {
    // Bike-specific implementation
}
```

### Method Overriding

Both `Car` and `Bike` override `calculateRent()` to implement vehicle-specific rental calculations.

### Runtime Polymorphism

The application uses a `Rental` reference to dynamically select the appropriate vehicle implementation.

```java
Rental rental;

if (choice == 1) {
    rental = new Bike();
} else if (choice == 2) {
    rental = new Car();
}
```

The appropriate overridden method is invoked at runtime.

## Project Architecture

```text
DriveEase Rentals
│
├── Rental.java
│   └── Rental interface
│
├── RentalOperations.java
│   └── Abstract base class
│
├── Car.java
│   └── Car rental implementation
│
├── Bike.java
│   └── Bike rental implementation
│
└── RentalApp.java
    └── Application entry point
```

## Application Flow

```text
Start
  │
  ▼
Select Vehicle Type
  │
  ├── Car
  │
  └── Bike
  │
  ▼
Enter Customer Details
  │
  ▼
Validate Age
  │
  ▼
Validate Phone Number
  │
  ▼
Validate Driving Licence
  │
  ▼
Check Vehicle Availability
  │
  ▼
Select Vehicle
  │
  ▼
Enter Rental Duration
  │
  ▼
Calculate Rental Amount
  │
  ▼
Add Security Deposit
  │
  ▼
Display Rental Summary
  │
  ▼
End
```

## Rental Calculation

The application calculates the total rental amount using:

```text
Total Amount = (Rent Per Day × Number of Days) + Security Deposit
```

The current security deposit is **₹2,000**.

### Example

```text
Rent Per Day     : ₹5,000
Number of Days   : 3
Security Deposit : ₹2,000

Total Amount     : ₹17,000
```

## Validation

### Age Validation

Customers must be at least 18 years old.

```java
age >= 18
```

### Phone Number Validation

The application validates a 10-digit Indian mobile number using:

```text
[6-9][0-9]{9}
```

### Driving Licence Validation

The application validates the licence number using a regular expression pattern.

## Getting Started

### Prerequisites

* Java JDK 8 or higher
* Eclipse, IntelliJ IDEA, or VS Code
* Basic knowledge of Java

### Clone the Repository

```bash
git clone <your-repository-url>
```

### Open the Project

Import the project into your preferred Java IDE.

### Run the Application

Execute:

```text
RentalApp.java
```

Follow the instructions displayed in the console.

## Sample Output

```text
======================================
       WELCOME TO DRIVEEASE
              RENTALS
======================================

1. Bike Rental
2. Car Rental

Enter your choice:
2

Enter your Age:
25

Enter your Phone Number:
9876543210

Enter your Licence Number:
AP1234561234567

Eligible for Rental

Check Availability (yes/no):
yes

Vehicle is Available

----- AVAILABLE CARS -----

1. Innova      - 6 Seats
2. Fortuner    - 7 Seats
3. BMW         - 5 Seats
...

Enter your Car Choice:
1

Enter How Many Days You Want:
3

----- CAR RENTAL DETAILS -----

Car Model        : Innova
Number of Seats  : 6
Rent Per Day     : 5000.0
Number of Days   : 3
Security Deposit : 2000.0
Total Amount     : 17000.0
```

## Future Enhancements

The current console-based application can be extended into a complete rental management platform by adding:

* **JDBC + MySQL** database integration
* Customer registration and authentication
* Persistent booking records
* Vehicle inventory management
* Booking and cancellation functionality
* Vehicle return management
* Payment processing
* Admin management module
* REST APIs using Spring Boot
* Web interface using HTML, CSS, JavaScript, and Bootstrap

## Learning Outcomes

This project provided hands-on experience with:

* Object-Oriented Programming
* Interfaces and Abstract Classes
* Inheritance
* Runtime Polymorphism
* Method Overriding
* Regular Expressions
* Exception-aware input handling
* Console-based application design
* Modular Java programming

## Author

**Tirupathi Badi**

Java Full Stack Developer | Core Java | SQL | Web Technologies

---

### Project Status

**Completed — Console Application**

Future versions can extend the application with database persistence, authentication, REST APIs, and a web-based user interface.

---


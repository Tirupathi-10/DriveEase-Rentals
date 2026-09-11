package com.Oops.CarRental;

public class RentalApp {

	public static void main(String[] args) {

		System.out.println("======================================");
		System.out.println("       WELCOME TO DRIVEEASE\n" + "              RENTALS");
		System.out.println("======================================");

		System.out.println("1. Bike Rental");
		System.out.println("2. Car Rental");
		System.out.println("Enter your choice:");

		int choice = RentalOperations.sc.nextInt();

		Rental rental;

		if (choice == 1) {

			rental = new Bike();

		} else if (choice == 2) {

			rental = new Car();

		} else {

			System.out.println("Invalid Choice!");
			return;
		}

		int age = rental.getAge();
		boolean phone = rental.isPhoneNumber();
		boolean licence = rental.isLicenceValid();

		if (age >= 18 && phone && licence) {

			System.out.println("Eligible for Rental");

			if (rental.checkAvailability()) {

				double totalAmount = rental.calculateRent();
				if (totalAmount > 0) {

					System.out.println();
					System.out.println("======================================");
					System.out.println("Final Rental Amount : " + totalAmount);
					System.out.println("Thank You for Choosing DriveEase Rentals!");
					System.out.println("======================================");
				}

			} else {

				System.out.println("Vehicle is Not Available");
			}

		} else {

			System.out.println("Invalid Entry!!! Please Re-Enter the Valid Details...");
		}
	}
}
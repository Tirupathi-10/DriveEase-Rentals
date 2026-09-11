package com.Oops.CarRental;

public class Car extends RentalOperations {

	@Override
	public double calculateRent() {

		System.out.println();
		System.out.println("----- AVAILABLE CARS -----");
		System.out.println("1. Innova      - 6 Seats");
		System.out.println("2. Fortuner    - 7 Seats");
		System.out.println("3. BMW         - 5 Seats");
		System.out.println("4. Swift       - 5 Seats");
		System.out.println("5. Baleno      - 5 Seats");
		System.out.println("6. Creta       - 5 Seats");
		System.out.println("7. Venue       - 5 Seats");
		System.out.println("8. Nexon       - 5 Seats");
		System.out.println("9. XUV700      - 7 Seats");
		System.out.println("10. Scorpio    - 7 Seats");
		System.out.println("11. Thar       - 4 Seats");
		System.out.println("12. KiaSeltos  - 5 Seats");
		System.out.println("13. KiaCarens  - 7 Seats");
		System.out.println("14. Mercedes   - 5 Seats");
		System.out.println("15. Audi       - 5 Seats");

		System.out.println("Enter your Car Choice:");
		int choice = sc.nextInt();

		String model;
		double rent;
		int seats;

		if (choice == 1) {

			model = "Innova";
			rent = 5000;
			seats = 6;

		} else if (choice == 2) {

			model = "Fortuner";
			rent = 7000;
			seats = 7;

		} else if (choice == 3) {

			model = "BMW";
			rent = 10000;
			seats = 5;

		} else if (choice == 4) {

			model = "Swift";
			rent = 3000;
			seats = 5;

		} else if (choice == 5) {

			model = "Baleno";
			rent = 3500;
			seats = 5;

		} else if (choice == 6) {

			model = "Creta";
			rent = 4500;
			seats = 5;

		} else if (choice == 7) {

			model = "Venue";
			rent = 4000;
			seats = 5;

		} else if (choice == 8) {

			model = "Nexon";
			rent = 4000;
			seats = 5;

		} else if (choice == 9) {

			model = "XUV700";
			rent = 6500;
			seats = 7;

		} else if (choice == 10) {

			model = "Scorpio";
			rent = 6000;
			seats = 7;

		} else if (choice == 11) {

			model = "Thar";
			rent = 5500;
			seats = 4;

		} else if (choice == 12) {

			model = "KiaSeltos";
			rent = 4500;
			seats = 5;

		} else if (choice == 13) {

			model = "KiaCarens";
			rent = 5500;
			seats = 7;

		} else if (choice == 14) {

			model = "Mercedes";
			rent = 12000;
			seats = 5;

		} else if (choice == 15) {

			model = "Audi";
			rent = 11000;
			seats = 5;

		} else {

			System.out.println("Invalid Car Choice");
			return 0;
		}

		System.out.println("Enter How Many Days You Want:");
		int days = sc.nextInt();

		double deposit = securityDeposit();
		double totalAmount = (rent * days) + deposit;

		System.out.println();
		System.out.println("----- CAR RENTAL DETAILS -----");
		System.out.println("Car Model        : " + model);
		System.out.println("Number of Seats  : " + seats);
		System.out.println("Rent Per Day     : " + rent);
		System.out.println("Number of Days   : " + days);
		System.out.println("Security Deposit : " + deposit);
		System.out.println("Total Amount     : " + totalAmount);

		return totalAmount;
	}
}
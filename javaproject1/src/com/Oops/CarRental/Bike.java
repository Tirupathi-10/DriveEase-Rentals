package com.Oops.CarRental;

public class Bike extends RentalOperations {

	@Override
	public double calculateRent() {

		System.out.println();
		System.out.println("----- AVAILABLE BIKES -----");
		System.out.println("1. RoyalEnfield");
		System.out.println("2. KTM");
		System.out.println("3. Yamaha");
		System.out.println("4. Pulsar");
		System.out.println("5. Apache");
		System.out.println("6. Activa");
		System.out.println("7. Access");
		System.out.println("8. Jupiter");
		System.out.println("9. R15");
		System.out.println("10. Duke");
		System.out.println("11. Dominar");
		System.out.println("12. Himalayan");
		System.out.println("13. FZ");
		System.out.println("14. MT15");
		System.out.println("15. Hayabusa");

		System.out.println("Enter your Bike Choice:");
		int choice = sc.nextInt();

		String model;
		double rent;

		if (choice == 1) {
			model = "RoyalEnfield";
			rent = 1500;
		} else if (choice == 2) {
			model = "KTM";
			rent = 1000;
		} else if (choice == 3) {
			model = "Yamaha";
			rent = 1000;
		} else if (choice == 4) {
			model = "Pulsar";
			rent = 800;
		} else if (choice == 5) {
			model = "Apache";
			rent = 900;
		} else if (choice == 6) {
			model = "Activa";
			rent = 500;
		} else if (choice == 7) {
			model = "Access";
			rent = 600;
		} else if (choice == 8) {
			model = "Jupiter";
			rent = 700;
		} else if (choice == 9) {
			model = "R15";
			rent = 1000;
		} else if (choice == 10) {
			model = "Duke";
			rent = 1200;
		} else if (choice == 11) {
			model = "Dominar";
			rent = 1500;
		} else if (choice == 12) {
			model = "Himalayan";
			rent = 2000;
		} else if (choice == 13) {
			model = "FZ";
			rent = 900;
		} else if (choice == 14) {
			model = "MT15";
			rent = 1000;
		} else if (choice == 15) {
			model = "Hayabusa";
			rent = 2000;
		} else {
			System.out.println("Invalid Bike Choice");
			return 0;
		}

		System.out.println("Enter How Many Days You Want:");
		int days = sc.nextInt();

		double deposit = securityDeposit();
		double totalAmount = (rent * days) + deposit;

		System.out.println();
		System.out.println("----- BIKE RENTAL DETAILS -----");
		System.out.println("Bike Model       : " + model);
		System.out.println("Rent Per Day     : " + rent);
		System.out.println("Number of Days   : " + days);
		System.out.println("Security Deposit : " + deposit);
		System.out.println("Total Amount     : " + totalAmount);

		return totalAmount;
	}
}
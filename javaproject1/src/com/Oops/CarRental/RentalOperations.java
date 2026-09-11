package com.Oops.CarRental;

import java.util.Scanner;

public abstract class RentalOperations implements Rental {

	static Scanner sc = new Scanner(System.in);

    @Override
    public int getAge() {

        System.out.println("Enter your Age:");
        return sc.nextInt();
    }

    @Override
    public boolean isPhoneNumber() {

        System.out.println("Enter your Phone Number:");
        String phone = sc.next();

        return phone.matches("[6-9][0-9]{9}");
    }

    @Override
    public boolean isLicenceValid() {

        System.out.println("Enter your Licence Number:");
        String licence = sc.next();

        return licence.matches("[A-Z]{2}[0-9]{2}[0-9]{4}[0-9]{7}");
    }

    @Override
    public boolean checkAvailability() {

        System.out.println("Check Availability (yes/no):");
        String availability = sc.next();

        if (availability.equalsIgnoreCase("yes")) {
            System.out.println("Vehicle is Available");
            return true;
        } else {
            System.out.println("Vehicle is Not Available");
            return false;
        }
    }

    @Override
    public abstract double calculateRent(); 
        

    @Override
    public double securityDeposit() {
        return 2000;
    }
}
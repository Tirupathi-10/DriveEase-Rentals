package com.Oops.CarRental;

public interface Rental {

    int getAge();

    boolean isPhoneNumber();

    boolean isLicenceValid();

    boolean checkAvailability();

    double calculateRent();

    double securityDeposit();
}
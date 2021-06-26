package com.bridLabzs;

public class Hotel {
    public String hotelName;
    public int dailyRate;
    /**
     * This one is a parameterised constructor which will initiate the value.
     * hotelName
     * dailyRate
     */
    public Hotel(String hotelName, int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Hotel Reservation Program");
    }
}

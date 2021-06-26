package com.bridLabzs;

public class Hotel {
    public String hotelName;
    public int dailyRate;
    /**
     * This One is a parameterised constructor which will initiate the value.
     * hotelName
     * dailyRate
     */
    public Hotel(String hotelName, int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }
    /**
     * Here I have added welcome message.
     * args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Hotel Reservation Program");
    }
}

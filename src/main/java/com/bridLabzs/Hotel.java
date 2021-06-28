package com.bridLabzs;

public class Hotel {
    public String hotelName;
    public int dailyRate,weekDayRate,weekEndRate;
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
     * Here I have created one more parameterised constructor for testcase which will initialise weekday rate and weekEnd rate.
     * hotelName
     * weekDayRate
     * weekEndRate
     */
    public Hotel(String hotelName,int weekDayRate,int weekEndRate){
        this.hotelName=hotelName;
        this.weekDayRate=weekDayRate;
        this.weekEndRate=weekEndRate;
    }
    /**
     * This is a overridden method which will print hotelname and rate,weekdayrate and weekEnd rate.
     * return
     */
    public String toString() {
        return "Hotel: " + hotelName + "Weekday Rate: " + weekDayRate+" & WeekEnd Rate: "+weekEndRate;
    }
    /**
     * Here I have used setter and getter method to set name and rate and according to that will get the value.
     * return
     */
    public String getName() {
        return hotelName;
    }
    public void setName(String name) {
        this.hotelName = hotelName;
    }
    /**
     * This method will take the no.ofdays and then set the rate.
     * noOfDays
     */
    public void setRate(int noOfDays) {
        this.dailyRate = this.dailyRate*noOfDays;
    }
    /**
     * return total rate.
     */
    public int getRate() {
        return dailyRate;
    }
    /**
     * Here I have added welcome message.
     * args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}

package com.bridLabzs;

public class Hotel {
    public String hotelName;
    public int weekDayRate,weekEndRate,totalRate,ratings;
    /**
     * Here I have created one parameterised constructor which will initialise hotelName,weekday rate,weekEnd rate and ratings.
     * hotelName
     * weekDayRate
     * weekEndRate
     * ratings
     */
    public Hotel(String hotelName,int weekDayRate,int weekEndRate,int ratings){
        this.hotelName=hotelName;
        this.weekDayRate=weekDayRate;
        this.weekEndRate=weekEndRate;
        this.ratings=ratings;
    }
    /**
     * This is a overridden method which will print hotelname,weekdayrate and weekEnd rate.
     * return
     */
    public String toString() {
        return "Hotel: " + hotelName + "Weekday Rate: " + weekDayRate+" & WeekEnd Rate: "+weekEndRate+" & Totalrate is: "+totalRate+" & Rating: "+ratings;
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
     * In this setter method I have taken the parameters below and added totalRate which will add both weekdayRate and weekEndRate.
     * weekDayCount
     * weekEndsCount
     */
    public void setRate(int weekDayCount,int weekEndsCount){
        this.weekDayRate = this.weekDayRate*weekDayCount;
        this.weekEndRate = this.weekEndRate*weekEndsCount;
        this.totalRate = this.weekDayRate + this.weekEndRate;
    }
    /**
     * return weekDaysRate+weekEndsRate
     */
    public int getRate() {
        return this.weekDayRate + this.weekEndRate;
    }
    /**
     * return totalrate
     */
    public int getTotalRate() {
        return this.totalRate;
    }
    /**
     * Here I have added welcome message.
     * args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}

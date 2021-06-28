package com.bridLabzs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HotelReservationServices {
    /**
     * Here I have created an arraylist to store values of hotel name and rates.
     */
    public List<Hotel> hotelList = new ArrayList<>();
    /**
     * This add method will add the hotel values such as Name and rate in the Arraylist.
     * hotel
     */
    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }
    /**
     * This method will return the values.
     *
     * return
     */
    public List<Hotel> getHotels() {
        return hotelList;
    }
    /**
     * Here I have taken the dates as YYYY-MM-DD format.
     * This method will count NoOfWeekEnds.
     * firstDate
     * lastDate
     * return
     */
    public int NoOfWeekEnds(String firstDate,String lastDate) throws InvalidDateError {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        if(startDate.compareTo(endDate)<0){
            int saturday = 0;
            int sunday = 0;
            while (!startDate.isAfter(endDate)) {
                if (startDate.getDayOfWeek().equals(DayOfWeek.SATURDAY))
                    saturday++;
                else if (startDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                    sunday++;
                startDate = startDate.plusDays(1);
            }
            System.out.println("Saturday count=="+saturday);
            System.out.println("Sunday count=="+sunday);
            return saturday+sunday;
        }
        else {
            throw new InvalidDateError("Invalid date.....please Enter valid first date and last date\nfirstdate should be before than lastdate");
        }
    }
    /**
     * This method will count NoOfWeekDays.
     * firstDate
     * lastDate
     * return
     * throws InvalidDateError
     */
    public int NoOfWeekDays(String firstDate,String lastDate) throws InvalidDateError {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        if(startDate.compareTo(endDate)<0){
            int noOfDays=(int) ChronoUnit.DAYS.between(startDate,endDate);
            int noOfWeekEnds=NoOfWeekEnds(firstDate,lastDate);
            return  noOfDays-noOfWeekEnds;
        }
        else {
            throw new InvalidDateError("Invalid date.....please Enter valid first date and last date\nfirstdate should be before than lastdate");
        }
    }
    /**
     * This method will take date range as parameter and check the cheapestRate by using min operation.
     * here the return type is an object of class Hotel through which this method can access the values.
     * return cheapestRate(obj of Hotel).
     */
    public Hotel findCheapestHotel(String firstDate,String lastDate) throws InvalidDateError {
        int weekDaysCount = NoOfWeekDays(firstDate, lastDate);
        int weekEndsCount = NoOfWeekEnds(firstDate, lastDate);
        hotelList.stream().map(p -> {p.setRate(weekDaysCount,weekEndsCount); return p.getRate(); }).collect(Collectors.toList());
        Hotel cheapestHotel =  hotelList.stream().min(Comparator.comparing(Hotel::getRate)).orElse(null);
        int cheapestRate = cheapestHotel.getTotalRate();
        Predicate<Hotel> minimum = elements -> elements.getTotalRate()==cheapestRate;
        List<Hotel> minimumRateHotelList = hotelList.stream().filter(minimum).collect(Collectors.toList());
        minimumRateHotelList.stream().forEach(System.out::println);
        return cheapestHotel;
    }
}

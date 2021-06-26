package com.bridLabzs;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationServices {
    /**
     * Here I have created an arraylist to store values of hotel name and rates.
     */
    private List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    /**
     * This method will return the values.
     * return
     */
    public List<Hotel> getHotels() {
        return hotelList;
    }
}

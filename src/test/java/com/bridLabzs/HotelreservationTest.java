package com.bridLabzs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
/**
 * This Test case will check that hotel is added or not.
 */
public class HotelreservationTest {
    /**
     * This test case will check whether weekday rate and weekend rate added or not.
     */
    @Test
    public void givenHotel_with3Parameters_shoulBeAbleToAdd_WeekdayAndWeekEndRate() {
        HotelReservationServices hotelReservationService = new HotelReservationServices();
        Hotel hotel = new Hotel("Lakewood", 110, 90,3);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }

    /**
     * Here it'll check the cheapest hotel according to the weekEnd and weekdays rates.
     * throws InvalidDateError
     */
    @Test
    public void givenHotelWillCheck_CheapestRate_from_TotalRate() throws InvalidDateError {
        HotelReservationServices hotelReservationService = new HotelReservationServices();
        Hotel lakewood = new Hotel("Lakewood", 110, 90,3);
        Hotel bridgewood = new Hotel("Bridgewood", 150, 50,4);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150,5);
        hotelReservationService.addHotel(lakewood);
        hotelReservationService.addHotel(bridgewood);
        hotelReservationService.addHotel(ridgewood);
        Hotel cheapestHotels = hotelReservationService.findCheapestHotel("2021-05-21","2021-05-26");
        Assertions.assertEquals(lakewood,cheapestHotels);

    }
}

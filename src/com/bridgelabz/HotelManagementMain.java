package com.bridgelabz;

import java.time.LocalDate;

public class HotelManagementMain {
    public static void main(String[] args) {
        System.out.println(" Welcome to Hotel Management System");
        HotelManagement hotelManagement = new HotelManagement();
        hotelManagement.insertHotel();
        hotelManagement.displayHotelList();
        LocalDate startDate = LocalDate.of(2022,5,23);
        LocalDate endDate = LocalDate.of(2022,5,27);
        System.out.println(startDate+" To "+endDate+" is a weekday and cheapest hotel is "+hotelManagement.cheapestHotel());
    }
}

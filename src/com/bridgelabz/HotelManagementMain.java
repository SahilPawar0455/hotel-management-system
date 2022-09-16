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
        System.out.println(startDate+" To "+endDate+" is a weekday \n cheapest hotel is : "+hotelManagement.cheapestHotelWeekDay());
        LocalDate startDates = LocalDate.of(2022,5,28);
        LocalDate endDates = LocalDate.of(2022,5,29);
        System.out.println(startDates+" To "+endDates+" is a weekend day \n cheapest hotel is : "+hotelManagement.cheapestHotelWeekEndDay());
        System.out.println("Cheapest best rated hotel is  "+hotelManagement.cheapestBestRatedHotel());
        System.out.println("Best Rated hotel is "+hotelManagement.bestRatedHotel());
    }
}

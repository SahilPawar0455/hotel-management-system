package com.bridgelabz;

public class HotelManagementMain {
    public static void main(String[] args) {
        System.out.println(" Welcome to Hotel Management System");
        HotelManagement hotelManagement = new HotelManagement();
        hotelManagement.insertHotel();
        hotelManagement.displayHotelList();
    }
}

package com.bridgelabz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelManagement {
   public static List hotelList = new ArrayList<>();
   Hotel hotel;
   public void addHotel(String hotelName, double weekRates, double weekendRates){
       hotel = new Hotel();
       hotel.setHotelName(hotelName);
       hotel.setWeekRates(weekRates);
       hotel.setWeekendRates(weekendRates);
       hotelList.add(hotel);
   }
   public void insertHotel(){
       addHotel("Lakewood",110,90);
       addHotel("Bridgewood",160,50);
       addHotel("Ridgewood",220,150);
   }
   public void displayHotelList(){
       for (Object hotel : hotelList) {
           System.out.println(hotel);
       }
   }
   public Optional cheapestHotel(){
        Optional cheapestHotel = hotelList.stream().min(Comparator.comparing(Hotel::getWeekRates));
        return cheapestHotel;
   }
}

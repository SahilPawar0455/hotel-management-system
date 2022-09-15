package com.bridgelabz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelManagement {
   public static List hotelList = new ArrayList<>();
   Hotel hotel;
   public void addHotel(String hotelName, double rates){
       hotel = new Hotel();
       hotel.setHotelName(hotelName);
       hotel.setRates(rates);
       hotelList.add(hotel);
   }
   public void insertHotel(){
       addHotel("Lakewood",110);
       addHotel("Bridgewood",160);
       addHotel("Ridgewood",220);
   }
   public void displayHotelList(){
       for (Object hotel : hotelList) {
           System.out.println(hotel);
       }
   }
   public Optional cheapestHotel(){
        Optional cheapestHotel = hotelList.stream().min(Comparator.comparing(Hotel::getRates));
        return cheapestHotel;
   }
}

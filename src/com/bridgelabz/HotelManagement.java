package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

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
}

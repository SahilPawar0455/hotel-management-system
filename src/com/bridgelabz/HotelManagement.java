package com.bridgelabz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelManagement {
   public static List<Hotel> hotelList = new ArrayList<>();
   Hotel hotel;
   public void addHotel(String hotelName, double weekRates, double weekendRates,double hotelRating){
       hotel = new Hotel();
       hotel.setHotelName(hotelName);
       hotel.setWeekRates(weekRates);
       hotel.setWeekendRates(weekendRates);
       hotel.setHotelRating(hotelRating);
       hotelList.add(hotel);
   }
   public void insertHotel(){
       addHotel("Lakewood",110,90,3);
       addHotel("Bridgewood",160,50,4);
       addHotel("Ridgewood",220,150,5);
   }
   public void displayHotelList(){
       for (Object hotel : hotelList) {
           System.out.println(hotel);
       }
   }
   public Optional cheapestHotelWeekDay(){
        Optional cheapestHotel = hotelList.stream().min(Comparator.comparing(Hotel::getWeekRates));
        return cheapestHotel;
   }

    public Object cheapestHotelWeekEndDay() {
       Optional chepestHotel = hotelList.stream().min(Comparator.comparing(Hotel::getWeekendRates));
       return chepestHotel;
    }
    
    public Hotel cheapestBestRatedHotel(){
       double sumOfRatedHotel = 0;
        for (int i = 0; i < hotelList.size(); i++) {
           sumOfRatedHotel += hotelList.get(i).getHotelRating();
        }
        int averageRated = (int) (sumOfRatedHotel/(hotelList.size()));
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getHotelRating() == averageRated){
                return hotelList.get(i);
            }
        }
        return null;
    }
}

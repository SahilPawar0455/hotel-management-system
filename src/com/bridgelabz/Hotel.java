package com.bridgelabz;

public class Hotel {
    public String hotelName;
    public double weekRates;
    public double weekendRates;

    public double hotelRating;

    public Hotel() {
    }

    public Hotel(String hotelName, double weekRates, double weekendRates, double hotelRating) {
        this.hotelName = hotelName;
        this.weekRates = weekRates;
        this.weekendRates = weekendRates;
        this.hotelRating = hotelRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getWeekRates() {
        return weekRates;
    }

    public void setWeekRates(double weekRates) {
        this.weekRates = weekRates;
    }

    public double getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(double weekendRates) {
        this.weekendRates = weekendRates;
    }

    public double getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(double hotelRating) {
        this.hotelRating = hotelRating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekRates=" + weekRates +
                ", weekendRates=" + weekendRates +
                ", hotelRating=" + hotelRating +
                '}';
    }
}

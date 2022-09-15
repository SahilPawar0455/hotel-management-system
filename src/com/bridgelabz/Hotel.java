package com.bridgelabz;

public class Hotel {
    public String hotelName;
    public double weekRates;
    public double weekendRates;

    public Hotel() {
    }

    public Hotel(String hotelName, double weekRates, double weekendRates) {
        this.hotelName = hotelName;
        this.weekRates = weekRates;
        this.weekendRates = weekendRates;
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

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekRates=" + weekRates +
                ", weekendRates=" + weekendRates +
                '}';
    }
}

package com.bridgelabz;

public class Hotel {
    public String hotelName;
    public double rates;

    public Hotel() {
    }

    public Hotel(String hotelName, double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rates='" + rates + '\'' +
                '}';
    }
}

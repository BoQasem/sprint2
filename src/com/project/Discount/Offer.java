package com.project.Discount;

import com.project.Ride;

public class Offer {
    private Ride rideRequest;
    private String driverName;
    private double price;
    

    public Offer(Ride rideRequest, double price, String driverName, double driverRating) {
        this.driverName = driverName;
        this.rideRequest = rideRequest;
        this.price = price;
    }

    public Offer() {
    }
    
    public Offer(Offer offer) {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDriverName() {
        return driverName;
    }

    public Ride getRideRequest() {
        return rideRequest;
    }

    public String originalPrice() {
        return (rideRequest + "\nOriginal Price: " 
              + price + "\ndriver username: " );
    }

    

    

}
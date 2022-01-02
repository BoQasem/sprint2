package com.project;

public class Ride {

	private String source ;
	private String destination ;
	private String price ;
	private String clientName;
	public int numberOfPassengers;


	public Ride(String src, String dest, String userName, int numberOfPassengers){
        source = src;
        destination = dest;
        clientName = userName;
        this.numberOfPassengers = numberOfPassengers;
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
	public void setNumberOfPassengers(int num) {
        this.numberOfPassengers = num;
    }
	public String getClientUserName() {
        return clientName;
    }
	
}

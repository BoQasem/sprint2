package com.project.Discount;

public class discounts extends Offer{

    private Offer offer;

    public discounts(Offer offer) {
        super(offer);
        this.offer = offer;
    }

    public double getPriceAfterDescount(double discount) {
        double temp = offer.getPrice(); 
        return offer.getPrice() - (temp * discount);
         
    }

    public String showScreen(String text){
        return (offer.originalPrice() + "\n" + text);
    }
    
    
}

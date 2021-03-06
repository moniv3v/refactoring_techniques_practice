package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        return getBasePrice(quantity,itemPrice) - getDiscount(quantity,itemPrice)+getShippingCost(quantity,itemPrice);
    }

    private double getShippingCost(int quantity,int itemPrice){
        return Math.min(quantity * itemPrice * 0.1, 100.0);
    }

    private double getDiscount(int quantity, int itemPrice) {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private int getBasePrice(int quantity,int itemPrice) {
        return quantity * itemPrice;
    }

}

package com.company;

public class AdditionalProduct extends Product {

    AdditionalProduct(String name, double price){
        super(name, price);
    }

    AdditionalProduct(String name, double price, int rating){
        super(name, price, rating);
    }
}

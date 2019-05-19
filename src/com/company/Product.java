package com.company;

public abstract class Product {

    protected String name;
    protected double price;
    protected int rating = 0;

    Product(){}
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    Product(String name, double price, int rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    void increaseRat(int amount) {
        if (rating + amount <= 5) rating += amount;
        else {
            rating = 5;
            System.out.print("maxRating");
        }
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    int getRating() {
        return this.rating;
    }

}

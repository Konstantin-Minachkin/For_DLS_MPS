package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MainProduct extends Product{

    ArrayList<AdditionalProduct> associatedProducts;

    MainProduct(){}

    MainProduct(String name, double price, ArrayList<AdditionalProduct> products){
        super(name, price);
        if (products.isEmpty()) {
            System.out.println("Error in " + getName() + ". Need at least 1 associated product");
            throw new EmptyStackException();
        }
        this.associatedProducts = new ArrayList<AdditionalProduct>(products);
    }

    MainProduct(String name, double price, int rating, ArrayList<AdditionalProduct> products){
        super(name, price, rating);
        if (products.isEmpty()) {
            System.out.println("Error in " + getName() + ". Need at least 1 associated product");
            throw new EmptyStackException();
        }
        this.associatedProducts = new ArrayList<AdditionalProduct>(products);
    }

    MainProduct(String name, double price){
        super(name, price);
        this.associatedProducts = new ArrayList<AdditionalProduct>();
    }

    MainProduct(String name, double price, int rating){
        super(name, price, rating);
        this.associatedProducts = new ArrayList<AdditionalProduct>();
    }

    void increaseRat(int amount) {
        if (rating + amount < 5) rating += amount;
        else {
            rating = 5;
            System.out.print("maxRating for " + getName());
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

    public void setAssociatedProducts(ArrayList<AdditionalProduct> associatedProducts) {
        this.associatedProducts = new ArrayList<AdditionalProduct>(associatedProducts);
    }

    public void addAssociatedProducts(ArrayList<AdditionalProduct> associatedProducts) {
        for (AdditionalProduct it : associatedProducts)
            this.associatedProducts.add(it);
    }

    public void addAssociatedProducts(AdditionalProduct ap) {
        this.associatedProducts.add(ap);
    }
}

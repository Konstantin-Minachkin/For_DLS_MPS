package com.company;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ProductList {
    ArrayList<MainProduct> mainProducts = new ArrayList<MainProduct>();
    ArrayList<AdditionalProduct> additProducts = new ArrayList<AdditionalProduct>();

    ProductList(){}
    ProductList( ArrayList<MainProduct> mainProducts, ArrayList<AdditionalProduct> additProducts){
        this.mainProducts = mainProducts;
        this.additProducts = additProducts;
    }

    public void add(MainProduct p){
        if (p.name != null) mainProducts.add(p);
    }

    public void add(AdditionalProduct p){
        if (p.name != null) additProducts.add(p);
    }

    public void buyAll(){
        if (mainProducts.size() > 0) {
            for (MainProduct it : mainProducts) {
                if (additProducts.size() > 0) {
                    for (AdditionalProduct ap : it.associatedProducts) {
                        if (additProducts.contains(ap)) {
                            System.out.println("Bought " + ap.getName());
                            additProducts.remove(ap);
                        }
                    }
                }
                System.out.println("Bought " + it.getName());
            }
            mainProducts.clear();
        }
        else System.out.println("Nothing to buy ");
    }

    public void printList(){
        for (MainProduct it : mainProducts) {
            System.out.println(it.getName());
        }
        for (AdditionalProduct it : additProducts) {
            System.out.println(it.getName());
        }
    }
}

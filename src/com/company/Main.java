package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
            //Design system for recommended products list for online shop
//Recommended products list is list of items which depend on current content of buyer shopping cart.
// There are two types of products:
//Main product, that can be bought independently
//Additional product, that can be only bought for main product
//Both types of products have rating. There can be several additional products for each main product.
//You need to create prototype of the systems that consists of several interconnected (взаимосвязанных) classes.
            //надо создать класс продукт, наследовать от него главный и дополнитльный, и лист продуктов
            ArrayList<AdditionalProduct> temp = new ArrayList<AdditionalProduct>();
            AdditionalProduct addOne = new AdditionalProduct("name1.1", 200.25, 3);
            AdditionalProduct addTwo = new AdditionalProduct("name2.12", 200.25, 3);
            AdditionalProduct addThree = new AdditionalProduct("name3.", 200.25, 3);
            temp.add(addOne);
            temp.add(addTwo);
            MainProduct mOne = new MainProduct(), mTwo = new MainProduct(), mThree = new MainProduct();
            try {
                    mOne = new MainProduct("name1", 1000, temp);
            } catch (EmptyStackException a){ }
            try {
                    mTwo = new MainProduct("name2", 100, 5, temp);
            } catch (EmptyStackException a){ }
            temp.clear();
            try {
                    mThree = new MainProduct("name3", 120, 5, temp);
            } catch (EmptyStackException a){ }
            ProductList list = new ProductList();
            list.add(mOne);
            list.add(mTwo);
            list.add(addOne);
            list.add(addTwo);
            list.add(addThree);
            list.add(mThree);
            //если при покупке additProduct не покупается хотя бы один mainProd, связанный с ним - ошибка
            list.buyAll();
            list.printList();
    }
}

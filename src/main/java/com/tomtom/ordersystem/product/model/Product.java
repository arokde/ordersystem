package com.tomtom.ordersystem.product.model;

/*
A POJO to hold the details of the product including business rules
 */
public class Product {

    String name;

    String category;

    String rules;

    String price;




    public Product(String name, String category, String rules, String price) {
        this.name = name;
        this.category = category;
        this.rules = rules;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getRules() {
        return rules;
    }

    public String getPrice() {
        return price;
    }


}

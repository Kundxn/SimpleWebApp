package com.money.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int prodid;
    private String prodname;
    private int price;

    // Default constructor
    public Product() {}

    // Constructor with all fields
    public Product(int prodid, String prodname, int price) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.price = price;
    }

    // Getter and Setter for prodid
    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    // Getter and Setter for prodname
    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    // Getter and Setter for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid=" + prodid +
                ", prodname='" + prodname + '\'' +
                ", price=" + price +
                '}';
    }
}

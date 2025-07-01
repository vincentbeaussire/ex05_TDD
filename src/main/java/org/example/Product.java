package org.example;

public class Product {
    public String productName;
    public int sellIn;
    public int quality;

    public ProductUpdate update;

    public Product(String productName, int sellIn, int quality, ProductUpdate update) {
        this.productName = productName;
        this.sellIn = sellIn;
        this.quality = quality;
        this.update = update;
    }

    public void update() {
    }
}

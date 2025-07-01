package org.example;

public class NormalProductUpdate implements ProductUpdate {
    @Override
    public void update(Product product) {
        product.sellIn--;

        int productDegrade = (product.sellIn < 0) ? 2 : 1;
    }
}

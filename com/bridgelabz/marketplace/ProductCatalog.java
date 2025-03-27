package com.bridgelabz.marketplace;

import java.util.*;
public class ProductCatalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (T product : products) {
            product.displayProductDetails();
        }
    }
}

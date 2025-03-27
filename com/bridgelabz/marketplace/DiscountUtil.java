package com.bridgelabz.marketplace;

import java.util.*;
public class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println("Discount of " + percentage + "% applied to " + product.getName() + ". New Price: " + product.getPrice());
    }
}

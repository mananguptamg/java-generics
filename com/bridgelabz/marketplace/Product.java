package com.bridgelabz.marketplace;

abstract class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= (price * percentage / 100);
        }
    }

    public abstract void displayProductDetails();
}

// Book Product Class
class Book extends Product<BookCategory> {
    private String author;

    public Book(String name, double price, BookCategory category, String author) {
        super(name, price, category);
        this.author = author;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Book: " + getName() + " | Author: " + author + " | Category: " + getCategory() + " | Price:" + getPrice());
    }
}

// Clothing Product Class
class Clothing extends Product<ClothingCategory> {
    private String size;

    public Clothing(String name, double price, ClothingCategory category, String size) {
        super(name, price, category);
        this.size = size;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Clothing: " + getName() + " | Size: " + size + " | Category: " + getCategory() + " | Price:" + getPrice());
    }
}

enum BookCategory {
    FICTION, NON_FICTION, EDUCATION, SCIENCE
}

// Enum for Clothing categories
enum ClothingCategory {
    SUMMER_WEARS, WINTER_WEARS
}

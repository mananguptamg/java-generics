package com.bridgelabz.marketplace;

public class MarketPlaceSystem {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();

        // Adding books
        Book book1 = new Book("Gulliver Travels", 159, BookCategory.FICTION, "Jonathan Swift");
        Book book2 = new Book("Java Programming", 299, BookCategory.EDUCATION, "James Gosling");

        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);

        // Adding clothing
        Clothing shirt = new Clothing("T-Shirt", 1999, ClothingCategory.SUMMER_WEARS, "L");
        Clothing jacket = new Clothing("Jacket", 3999, ClothingCategory.WINTER_WEARS, "M");

        clothingCatalog.addProduct(shirt);
        clothingCatalog.addProduct(jacket);


        // Displaying all catalogs
        System.out.println("\n--- Book Catalog ---");
        bookCatalog.displayCatalog();

        System.out.println("\n--- Clothing Catalog ---");
        clothingCatalog.displayCatalog();


        // Applying discounts dynamically
        System.out.println("\n--- Applying Discounts ---");
        DiscountUtil.applyDiscount(book1, 10);
        DiscountUtil.applyDiscount(jacket, 20);
    }
}

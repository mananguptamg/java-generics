package com.bridgelabz.warehousemanagementsystem;

public class WarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items
        electronicsStorage.addItem(new Electronics("Fridge", 35000, "Samsung"));
        electronicsStorage.addItem(new Electronics("Television", 25000, "LG"));

        groceriesStorage.addItem(new Groceries("Apple", 280, "2025-04-10"));
        groceriesStorage.addItem(new Groceries("Rice", 20, "2026-01-15"));

        furnitureStorage.addItem(new Furniture("Sofa", 15000, "Cloth"));
        furnitureStorage.addItem(new Furniture("Table", 3000, "Wood"));

        // Display all items using wildcard method
        System.out.println("\nDisplaying all Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nDisplaying all Groceries:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nDisplaying all Furniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}

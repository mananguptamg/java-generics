package com.bridgelabz.warehousemanagementsystem;

abstract class WarehouseItem {
    private String name;
    private int price;

    public WarehouseItem(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public abstract void displayDetails();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand + " | Price:" + getPrice());
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, int price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + getName() + " | Expiry: " + expiryDate + " | Price:" + getPrice());
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + getName() + " | Material: " + material + " | Price:" + getPrice());
    }
}

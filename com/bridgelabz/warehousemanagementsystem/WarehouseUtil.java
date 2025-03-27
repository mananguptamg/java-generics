package com.bridgelabz.warehousemanagementsystem;
import java.util.*;
public class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}
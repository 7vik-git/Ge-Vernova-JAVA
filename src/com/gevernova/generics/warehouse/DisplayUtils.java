package com.gevernova.generics.warehouse;

import java.util.List;

public class DisplayUtils {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}


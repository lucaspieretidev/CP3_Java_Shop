package com.restaurant.orders.dto;

public class AddItemCommand {

    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
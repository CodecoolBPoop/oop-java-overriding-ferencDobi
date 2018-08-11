package com.codecool.uml.overriding;

public class Order implements Orderable {
    private static int nextID = 1;
    private int id;
    private String status;

    public Order() {
        id = nextID++;
        status = "new";
    }

    @Override
    public boolean checkout() {
        status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        status = "paid";
        return true;
    }

    public String getStatus() {
        return status;
    }
}

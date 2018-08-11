package com.codecool.uml.overriding;

public class Order implements Orderable {
    private int id;
    private String status;

    public Order() {
        // TODO
    }

    @Override
    public boolean checkout() {
        // TODO
        return false;
    }

    @Override
    public boolean pay() {
        // TODO
        return false;
    }

    public String getStatus() {
        return status;
    }
}

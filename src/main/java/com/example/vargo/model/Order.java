package com.example.vargo.model;

public class Order {
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    private int orderId;
    private int orderNumber;
    private int personId;

    public Order(int orderNumber, int personId) {
        this.orderNumber = orderNumber;
        this.personId = personId;
    }
}

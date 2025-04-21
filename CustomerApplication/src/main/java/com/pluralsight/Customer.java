package com.pluralsight;

public class Customer {
    private int id;
    private String name;
    private float outstandingBalance;  // type these out, the rest is generated!!!

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public Customer(int id, String name, float outstandingBalance) { // right click, generate, constructor
        this.id = id;
        this.name = name;
        this.outstandingBalance = outstandingBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outstandingBalance=" + outstandingBalance +
                '}';
    }
}

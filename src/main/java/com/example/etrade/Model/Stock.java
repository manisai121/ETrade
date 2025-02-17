package com.example.etrade.Model;

public class Stock {

    private String symbol;
    private int quantity;

    // Getters and Setters

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Stock(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }
}

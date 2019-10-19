package de.paffman.model;

public class Stock {

    private int wkn;
    private double price;

    public Stock(int wkn, double price) {
        this.wkn = wkn;
        this.price = price;
    }

    public int getWkn() {
        return wkn;
    }

    public void setWkn(int wkn) {
        this.wkn = wkn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

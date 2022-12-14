package com.blz.stock;

public class Stock {
    private String shareName;
    private int noOfShare;
    private double sharePrice;
    private double totalShareValue;

    public Stock(String shareName, int noOfShare, double sharePrice, double totalShareValue) {
        super();
        this.shareName = shareName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
        this.totalShareValue = totalShareValue;
        System.out.printf("%s\n", this);
    }

    public String getShareName() {
        return shareName;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getTotalShareValue() {
        return totalShareValue;
    }

    @Override
    public String toString() {
        return "Stock[shareName=" + shareName + ",noofShare=" + noOfShare + ",sharePrice=" + sharePrice + ",totalValue=" + totalShareValue + "]";

    }

}

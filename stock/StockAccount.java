package com.blz.stock;

public class StockAccount {
    public static void main(String[] args) throws Exception {
        StockPortFolio portFolio = new StockPortFolio();
        portFolio.readFinalInput();
        portFolio.writeDataIntoFile();


    }
}

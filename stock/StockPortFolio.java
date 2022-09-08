package com.blz.stock;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StockPortFolio {
    public String shareName;
    public int noOfShare;
    public double sharePrice;
    public double totalShareValue;

    private List<Stock> stocks;

    public StockPortFolio() {
        stocks = new ArrayList<>();

    }

    public void readFinalInput() throws Exception {
        String filePath = "X:\\StockManagment\\src\\com\\blz\\stock\\StockInfo.txt";
        List<String> lines = new ArrayList<String>();
        Path path = Paths.get(filePath);
        lines = Files.readAllLines(path);

        System.out.println(lines);
        for (String line : lines) {
            String[] word = line.split(" ");
            shareName = word[0];
            noOfShare = Integer.valueOf(word[1]);
            sharePrice = Double.valueOf(word[2]);
            totalShareValue = Integer.valueOf(word[1]) * Double.valueOf(word[2]);
            Stock stock = new Stock(shareName, noOfShare, sharePrice, totalShareValue);
            stocks.add(stock);
        }
    }

    public void writeDataIntoFile() throws Exception {
        String filepath = "X:\\StockManagment\\src\\com\\blz\\stock\\StockSharePrice.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        for (Stock s : stocks) {
            writer.write(s + System.lineSeparator());
        }
        writer.close();
    }
}

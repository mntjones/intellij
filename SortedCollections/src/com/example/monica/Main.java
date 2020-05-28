package com.example.monica;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("apple", 0.86, 100);
        stockList.addStock(temp);
        temp = new StockItem("bread", 0.70, 44);
        stockList.addStock(temp);
        temp = new StockItem("beef", 3.45, 15);
        stockList.addStock(temp);
        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("gum", 0.25, 22);
        stockList.addStock(temp);
        temp = new StockItem("milk", 0.90, 30);
        stockList.addStock(temp);
        temp = new StockItem("orange", 0.50, 20);
        stockList.addStock(temp);
        temp = new StockItem("salmon", 5.00, 8);
        stockList.addStock(temp);
        temp = new StockItem("yogurt", 0.33, 35);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println();
        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }
    }
}

package com.example.monica;

import java.util.Map;

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
        temp = new StockItem("yogurt", 0.55, 10);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println();
        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("Mia");
        sellItem(basket, "orange", 10);
        System.out.println(basket);

        sellItem(basket, "orange", 10);
        System.out.println(basket);

        sellItem(basket, "orange", 3);

        sellItem(basket, "candy", 3);
        System.out.println(basket);

        sellItem(basket, "bread", 1);
        System.out.println(basket);
        System.out.println(stockList);

        // can modify individual items, even though Map is unmodifiable
        // get and set available - 2 ways to get it
        stockList.Items().get("orange").adjustStock(200);
        stockList.get("orange").adjustStock(-100);
        System.out.println(stockList);

        // to make unmodifiable map
        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //get item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("No item " + item + " in stock.");
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }


}

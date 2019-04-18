package com.timbuchalka;

public class Main {
    private static StockList stockList = new StockList();
    private static Basket myBasket = new Basket("Raahil's Basket");
    public static void main(String[] args) {
        setupList();
        myBasket.addToBasket("bread", 10, stockList);
        //stockList.reserveStock("bread", 10, myBasket);
        stockList.checkout(myBasket);
        System.out.println(stockList);
    }
    private static void setupList(){
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
    }

}

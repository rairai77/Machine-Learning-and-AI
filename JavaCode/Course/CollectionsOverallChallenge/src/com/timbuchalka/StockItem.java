package com.timbuchalka;

import java.util.HashMap;

/**
 * Created by dev on 16/02/2016.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int reservedTotal;
    private HashMap<String, Integer> reserved = new HashMap<>();
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;  // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public boolean reserveItems(int quantity , Basket basket){
        int availableStock = quantityStock - reservedTotal;
        if(quantity <= availableStock && quantity * -1 <= availableStock){
            if(reserved.containsKey(basket.getName())){
                if(reserved.get(basket.getName()) + quantity > 0) {
                    reserved.replace(basket.getName(), reserved.get(basket.getName()) + quantity);
                }
                else if(reserved.get(basket.getName()) + quantity == 0) {
                    reserved.remove(basket.getName());
                }else{
                    return false;
                }
            }
            else {
                this.reserved.put(basket.getName(), quantity);
            }
            this.reservedTotal += quantity;
            return true;
        }else{
            return false;
        }
    }

    public boolean checkout(Basket basket){
        if(reserved.containsKey(basket.getName())) {
            reservedTotal -= reserved.get(basket.getName());
            System.out.println("---" + reserved.get(basket.getName()));
            quantityStock -= reserved.get(basket.getName());
            reserved.remove(basket.getName());
            return true;
        } else{
            return false;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}

package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell>stock;

    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int stockCount(){
        return stock.size();
    }

    public void addStock(ISell stockItem){
        stock.add(stockItem);
    }

    public void sellStock(ISell stockItem){
        stock.remove(stockItem);
    }

    public int calculateProfit(){
        int profit = 0;
        for(ISell stockItem : this.stock){
            profit += stockItem.calculateMarkup();
        }
        return profit;
    }
}

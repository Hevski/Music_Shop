package Misc;

public abstract class Misc {

    private String brand;
    private int tradePrice;
    private int retailPrice;

    public Misc(String brand, int tradePrice, int retailPrice) {
        this.brand = brand;
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(int tradePrice) {
        this.tradePrice = tradePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }
}

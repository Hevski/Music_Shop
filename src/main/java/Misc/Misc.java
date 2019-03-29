package Misc;

public abstract class Misc {

    private String brand;
    private double tradePrice;
    private double retailPrice;

    public Misc(String brand, double tradePrice, double retailPrice) {
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

    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(int tradePrice) {
        this.tradePrice = tradePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }
}

package Instruments;

public abstract class Instrument {

    private String type;
    private String brand;
    private double tradePrice;
    private double retailPrice;

    public Instrument(String type, String brand, double tradePrice, double retailPrice) {
        this.type = type;
        this.brand = brand;
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }
}

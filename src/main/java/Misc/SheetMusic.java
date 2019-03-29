package Misc;

import Interfaces.ISell;

public class SheetMusic extends Misc implements ISell {

    private String title;

    public SheetMusic(String brand, double tradePrice, double retailPrice, String title) {
        super(brand, tradePrice, retailPrice);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Double calculateMarkup() {
        return this.getRetailPrice() - this.getTradePrice();
    }
}

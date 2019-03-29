package Misc;

import Interfaces.ISell;

public class BassString extends Misc implements ISell {

    private int strings;

    public BassString(String brand, double tradePrice, double retailPrice, int strings) {
        super(brand, tradePrice, retailPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public Double calculateMarkup() {
        return this.getRetailPrice() - this.getTradePrice();
    }
}

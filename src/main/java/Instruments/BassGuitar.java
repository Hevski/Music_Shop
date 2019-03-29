package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class BassGuitar extends Instrument implements IPlay, ISell {

    private int strings;

    public BassGuitar(String type, String brand, Double tradePrice, Double retailPrice, int strings) {
        super(type, brand, tradePrice, retailPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public String play(String sound) {
        return "Bass sound: " + sound;
    }

    public Double calculateMarkup() {
        return this.getRetailPrice() - this.getTradePrice();
    }
}

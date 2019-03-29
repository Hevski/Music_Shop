package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {

    private int keys;

    public Keyboard(String type, String brand, double tradePrice, double retailPrice, int keys) {
        super(type, brand, tradePrice, retailPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play(String sound) {
        return "Keyboard sound: " + sound;
    }

    public Double calculateMarkup() {
        return this.getRetailPrice() - this.getTradePrice();
    }
}

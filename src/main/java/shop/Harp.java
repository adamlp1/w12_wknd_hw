package shop;

import behaviours.IPlay;
import behaviours.ISell;

public class Harp extends Instrument implements IPlay, ISell {
    private String make;
    private int stringCount;
    private int buyPrice;
    private int sellPrice;

    public Harp(String make, String colour, int stringCount, int buyPrice, int sellPrice) {
        super("Stringed", colour);
        this.make = make;
        this.stringCount = stringCount;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "Bllling";
    }

    public String getMake() {
        return this.make;
    }

    public int getStringCount() {
        return this.stringCount;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}

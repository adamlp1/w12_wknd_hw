package shop;

import behaviours.IPlay;
import behaviours.ISell;

public class Synthesizer extends Instrument implements IPlay, ISell {
    private String make;
    private int keyCount;
    private int buyPrice;
    private int sellPrice;

    public Synthesizer(String make, String colour, int keyCount, int buyPrice, int sellPrice) {
        super("Keyboard", colour);
        this.make = make;
        this.keyCount = keyCount;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return this.make;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int getKeyCount() {
        return this.keyCount;
    }

    public String play() {
        return "Womp";
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }



    }


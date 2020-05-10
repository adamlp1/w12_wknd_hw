package shop;

import behaviours.ISell;

public class GuitarStrap implements ISell {

    private String colour;
    private int buyPrice;
    private int sellPrice;

    public GuitarStrap(String colour, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return this.colour;
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

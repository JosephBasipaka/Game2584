package com.learning.hello.controller;

//import javafx.scene.paint.Color;

/**
 * Represents an individual tile in the game. Has an integer value and a color value - both of which change as they are combined.
 */
public class Tile {
    private int value;
    //private Color tileColor;

    /**
     * Constructs a basic tile with a value of 0.
     */
    public Tile() {
        value = 0;
    }

    /**
     * Constructs a tile with a value of number.
     *
     * @param number number to set value to.
     */
    public Tile(int number) {
        value = number;
    }

    /**
     * Gets the tile's value.
     *
     * @return value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the tile's value - used when adding two tiles together.
     *
     * @param value value to set the tile to.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Represents the tile as a String - used in the GUI.
     */
    public String toString() {
        return "" + value;
    }

    /**
     * Sets the tile's color based on its value.
     */
//    public void setColor() {
//        if (this.getValue() == 2) {
//            tileColor = Color.rgb(238, 228, 218);
//        } else if (this.getValue() == 4) {
//            tileColor = Color.rgb(237, 224, 200);
//        } else if (this.getValue() == 8) {
//            tileColor = Color.rgb(242, 177, 121);
//        } else if (this.getValue() == 16) {
//            tileColor = Color.rgb(245, 149, 99);
//        } else if (this.getValue() == 32) {
//            tileColor = Color.rgb(246, 124, 95);
//        } else if (this.getValue() == 64) {
//            tileColor = Color.rgb(246, 94, 59);
//        } else if (this.getValue() == 128) {
//            tileColor = Color.rgb(237, 207, 114);
//        } else if (this.getValue() == 256) {
//            tileColor = Color.rgb(237, 204, 97);
//        } else if (this.getValue() == 512) {
//            tileColor = Color.rgb(237, 200, 80);
//        } else if (this.getValue() == 1024) {
//            tileColor = Color.rgb(237, 197, 63);
//        } else {
//            tileColor = Color.rgb(237, 194, 46);
//        }
//    }

    /**
     * Gets the color based on setColor().
     *
     * @return tileColor.
     */
//    public Color getColor() {
//        this.setColor();
//        return tileColor;
//    }
}
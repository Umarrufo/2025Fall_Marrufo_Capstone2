package org.example;

import org.example.ENUMS.DrinkSize;

public class Drink
{
    private DrinkSize size;

    public Drink(DrinkSize size) {
        this.size = size;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }
}

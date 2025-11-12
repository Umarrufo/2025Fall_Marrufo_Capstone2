package org.example;

import org.example.ENUMS.DrinkSize;

public class Drink
{
    private DrinkSize size;

    public Drink(DrinkSize size) {
        this.size = size;
    }

    public Drink() {
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    public double getPrice()
    {
        double price;
        switch (size)
        {
            case SMALL:
                price = 2;
                break;
            case MEDIUM:
                price = 2.5;
                break;
            case LARGE:
                price = 3;
                break;
            default:
                price = 0;
                break;
        }
        return  price;
    }
}

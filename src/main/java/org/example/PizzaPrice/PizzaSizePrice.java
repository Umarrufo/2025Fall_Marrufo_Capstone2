package org.example.PizzaPrice;

import org.example.ENUMS.PizzaSize;

public class PizzaSizePrice
{
    private PizzaSize pizzaSize;

    public PizzaSizePrice(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public PizzaSizePrice() {
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice()
    {
        double price = 0;
        switch(pizzaSize)
        {
            case SMALL:
                price = 8.50;
                break;
            case MEDIUM:
                price = 12;
                break;
            case LARGE:
                price = 16.5;
                break;
            default:
                price = 0;
        }
        return  price;
    }
}

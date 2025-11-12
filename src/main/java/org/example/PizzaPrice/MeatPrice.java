package org.example.PizzaPrice;

import org.example.ENUMS.Meat;
import org.example.ENUMS.PizzaSize;

public class MeatPrice
{
    private Meat meatChoice;
    private PizzaSize pizzaSize;

    public MeatPrice(Meat meatChoice, PizzaSize size) {
        this.meatChoice = meatChoice;
        this.pizzaSize = size;
    }

    public MeatPrice() {
    }

    public Meat getMeatChoice() {
        return meatChoice;
    }

    public void setMeatChoice(Meat meatChoice) {
        this.meatChoice = meatChoice;
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

        switch (meatChoice)
        {
            case PEPPERONI:
            case SAUSAGE:
            case HAM:
            case BACON:
            case CHICKEN:
            case MEATBALL:
                switch(pizzaSize)
                {
                    case SMALL:
                        price = 1.0;
                        break;
                    case MEDIUM:
                        price = 2.0;
                        break;
                    case LARGE:
                        price = 3.0;
                        break;
                    default:
                        price = 0.0;
                }
        }
        return price;
    }
}

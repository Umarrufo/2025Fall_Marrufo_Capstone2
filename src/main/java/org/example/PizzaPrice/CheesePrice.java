package org.example.PizzaPrice;

import org.example.ENUMS.Cheese;
import org.example.ENUMS.PizzaSize;

public class CheesePrice
{
    private Cheese cheeseChoice;
    private PizzaSize pizzaSize;

    public CheesePrice(Cheese cheeseChoice, PizzaSize pizzaSize) {
        this.cheeseChoice = cheeseChoice;
        this.pizzaSize = pizzaSize;
    }

    public CheesePrice() {
    }

    public Cheese getCheeseChoice() {
        return cheeseChoice;
    }

    public void setCheeseChoice(Cheese cheeseChoice) {
        this.cheeseChoice = cheeseChoice;
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

        switch (cheeseChoice)
        {
            case MOZZARELLA:
            case PARMESAN:
            case RICOTTA:
            case GOAT_CHEESE:
            case BUFFALO:
                switch(pizzaSize)
                {
                    case SMALL:
                        price = 0.75;
                        break;
                    case MEDIUM:
                        price = 1.5;
                        break;
                    case LARGE:
                        price = 2.25;
                        break;
                }
                break;
            default:
                price = 0.0;
                break;
        }

        return price;
    }
}

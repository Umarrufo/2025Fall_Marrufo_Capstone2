package org.example;

import org.example.ENUMS.*;
import org.example.PizzaPrice.CheesePrice;
import org.example.PizzaPrice.MeatPrice;
import org.example.PizzaPrice.PizzaSizePrice;

import java.util.ArrayList;
import java.util.List;

public class Pizza
{
    private final PizzaSize pizzaSize;
    private final Crust crust;
    private List<Meat> meats = new ArrayList<>();
    private final boolean extraMeat;
    private List<Cheese> cheeses = new ArrayList<>();
    private final boolean extraCheese;
    private List<Topping> toppings = new ArrayList<>();
    private List<Sauce> sauces = new ArrayList<>();
    private List<Side> sides = new ArrayList<>();

    private Pizza(Builder builder)
    {
        this.pizzaSize = builder.pizzaSize;
        this.crust = builder.crust;
        this.meats = builder.meats;
        this.extraMeat = builder.extraMeat;
        this.cheeses = builder.cheeses;
        this.extraCheese = builder.extraCheese;
        this.toppings = builder.toppings;
        this.sauces = builder.sauces;
        this.sides = builder.sides;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public Crust getCrust() {
        return crust;
    }

    public List<Meat> getMeats() {
        return meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public List<Side> getSides() {
        return sides;
    }

    public double getPrice()
    {
        double total = 0;

        total += new PizzaSizePrice(pizzaSize).getPrice();

        Meat firstMeat = meats.get(0);
        total += new MeatPrice(firstMeat,pizzaSize).getPrice();

        if(extraMeat)
        {
            switch (pizzaSize) {
                case SMALL:
                    total += 0.5;
                    break;
                case MEDIUM:
                    total += 1.0;
                    break;
                case LARGE:
                    total += 1.5;
                    break;
            }
        }

        Cheese firstCheese = cheeses.get(0);
        total += new CheesePrice(firstCheese,pizzaSize).getPrice();

        if(extraCheese)
        {
            switch (pizzaSize)
            {
                case SMALL:
                    total += 0.3;
                    break;
                case MEDIUM:
                    total += 0.6;
                    break;
                case LARGE:
                    total += 0.9;
                    break;
            }
        }
        return total;

    }

    @Override
    public String toString()
    {
        return "Pizza(s):\n"
                + "Pizza Size: " + pizzaSize
                + "\nCrust Type: " + crust
                + "\nMeat: " + meats
                + "\nExtra Meat: " + extraMeat
                + "\nCheese: " + cheeses
                + "\nExtra Cheese: " + extraCheese
                + "\nTopping(s): " + toppings //Loop through toppings
                + "\nSauce: " + sauces
                + "\nSide: " + sides
                + "\n";
    }

    public static class Builder
    {
        private PizzaSize pizzaSize;
        private Crust crust;
        private List<Meat> meats;
        private boolean extraMeat;
        private List<Cheese> cheeses;
        private boolean extraCheese;
        private List<Topping> toppings;
        private List<Sauce> sauces;
        private List<Side> sides;


        public Builder()
        {
            this.toppings = new ArrayList<>();
        }

        public void setPizzaSize(PizzaSize pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public void setCrust(Crust crust) {
            this.crust = crust;
        }

        public void setMeats(List<Meat> meats) {
            this.meats = meats;
        }

        public void setExtraMeat(boolean extraMeat) {
            this.extraMeat = extraMeat;
        }

        public void setCheeses(List<Cheese> cheeses) {
            this.cheeses = cheeses;
        }

        public void setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
        }

        public void addToppings(Topping topping)
        {
            this.toppings.add(topping);
        }

        public void setToppings(List<Topping> toppings) {
            this.toppings = toppings;
        }

        public void setSauces(List<Sauce> sauces) {
            this.sauces = sauces;
        }

        public void setSides(List<Side> sides) {
            this.sides = sides;
        }

        public Pizza build()
        {
            return new Pizza(this);
        }
    }
}
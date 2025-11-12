package org.example;

import org.example.ENUMS.*;

import java.util.List;

public class Pizza
{
    private final PizzaSize pizzaSize;
    private final Crust crust;
    private final List<Meat> meats;
    private final List<Cheese> cheeses;
    private final List<Topping> toppings;
    private final List<Sauce> sauces;
    private final List<Side> sides;

    private Pizza(Builder builder)
    {
        this.pizzaSize = builder.pizzaSize;
        this.crust = builder.crust;
        this.meats = builder.meats;
        this.cheeses = builder.cheeses;
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

    public List<Cheese> getCheeses() {
        return cheeses;
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

    public static class Builder
    {
        private PizzaSize pizzaSize;
        private Crust crust;
        private List<Meat> meats;
        private List<Cheese> cheeses;
        private List<Topping> toppings;
        private List<Sauce> sauces;
        private List<Side> sides;

        public Builder(PizzaSize pizzaSize, Crust crust, List<Meat> meats, List<Cheese> cheeses, List<Topping> toppings, List<Sauce> sauces, List<Side> sides) {
            this.pizzaSize = pizzaSize;
            this.crust = crust;
            this.meats = meats;
            this.cheeses = cheeses;
            this.toppings = toppings;
            this.sauces = sauces;
            this.sides = sides;
        }

        public Builder(){

        }

        public Builder setPizzaSize(PizzaSize pizzaSize) {
            this.pizzaSize = pizzaSize;
            return this;
        }

        public Builder setCrust(Crust crust) {
            this.crust = crust;
            return this;
        }

        public Builder setMeats(List<Meat> meats) {
            this.meats = meats;
            return this;
        }

        public Builder setCheeses(List<Cheese> cheeses) {
            this.cheeses = cheeses;
            return this;
        }

        public Builder setToppings(List<Topping> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder setSauces(List<Sauce> sauces) {
            this.sauces = sauces;
            return this;
        }

        public Builder setSides(List<Side> sides) {
            this.sides = sides;
            return this;
        }

        public Pizza build()
        {
            return new Pizza(this);
        }

    }

}


package org.example;

import org.example.ENUMS.*;
import org.example.PizzaPrice.CheesePrice;
import org.example.PizzaPrice.DrinkPrice;
import org.example.PizzaPrice.MeatPrice;
import org.example.PizzaPrice.PizzaSizePrice;

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

    private Pizza(Builder builder) {
        this.pizzaSize = builder.pizzaSize;
        this.crust = builder.crust;
        this.meats = builder.meats;
        this.cheeses = builder.cheeses;
        this.toppings = builder.toppings;
        this.sauces = builder.sauces;
        this.sides = builder.sides;
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

        public void setPizzaSize(PizzaSize pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public void setCrust(Crust crust) {
            this.crust = crust;
        }

        public void setMeats(List<Meat> meats) {
            this.meats = meats;
        }

        public void setCheeses(List<Cheese> cheeses) {
            this.cheeses = cheeses;
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
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", crust=" + crust +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", toppings=" + toppings +
                ", sauces=" + sauces +
                ", sides=" + sides +
                '}';
    }

    public double orderPrice() {
        PizzaSizePrice pizzaSizePrice = new PizzaSizePrice();
        CheesePrice cheesePrice = new CheesePrice();
        MeatPrice meatPrice = new MeatPrice();
        DrinkPrice drinkPrice = new DrinkPrice();

        double total = pizzaSizePrice.getPrice() + cheesePrice.getPrice()
                + meatPrice.getPrice() + drinkPrice.getPrice();

        return total;
    }
}

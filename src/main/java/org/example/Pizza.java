package org.example;

import org.example.ENUMS.Crust;
import org.example.ENUMS.PizzaSize;
import org.example.PizzaPrice.CheesePrice;
import org.example.PizzaPrice.DrinkPrice;
import org.example.PizzaPrice.MeatPrice;
import org.example.PizzaPrice.PizzaSizePrice;

import java.util.List;

public class Pizza
{
    private PizzaSize pizzaSize;
    private Crust crust;
    private List<String> meat;
    private List<String> cheese;
    private List<String> toppings;
    private List<String> sauce;
    private List<String> side;

    public Pizza(PizzaSize pizzaSize, Crust crust, List<String> meat,
                 List<String> cheese, List<String> toppings,
                 List<String> sauce, List<String> side)
    {
        this.pizzaSize = pizzaSize;
        this.crust = crust;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauce = sauce;
        this.side = side;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public List<String> getMeat() {
        return meat;
    }

    public void setMeat(List<String> meat) {
        this.meat = meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public void setCheese(List<String> cheese) {
        this.cheese = cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public void setSauce(List<String> sauce) {
        this.sauce = sauce;
    }

    public List<String> getSide() {
        return side;
    }

    public void setSide(List<String> side) {
        this.side = side;
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

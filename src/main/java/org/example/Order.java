package org.example;

import org.example.PizzaPrice.CheesePrice;
import org.example.PizzaPrice.DrinkPrice;
import org.example.PizzaPrice.MeatPrice;
import org.example.PizzaPrice.PizzaSizePrice;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;


public class Order
{
    private LocalDate date;
    private LocalTime time;
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private int garlicKnots;
    private double amount;


    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public double orderPrice()
    {
        PizzaSizePrice pizzaSizePrice = new PizzaSizePrice();
        CheesePrice cheesePrice = new CheesePrice();
        MeatPrice meatPrice = new MeatPrice();
        DrinkPrice drinkPrice = new DrinkPrice();

        double total = pizzaSizePrice.getPrice() + cheesePrice.getPrice()
                + meatPrice.getPrice() + drinkPrice.getPrice();

        return total;
    }

}



package org.example;

import org.example.PizzaPrice.CheesePrice;
import org.example.PizzaPrice.DrinkPrice;
import org.example.PizzaPrice.MeatPrice;
import org.example.PizzaPrice.PizzaSizePrice;

import java.util.List;
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

    public Order(LocalDate date, LocalTime time, List<Pizza> pizzas, List<Drink> drinks, int garlicKnots, double amount) {
        this.date = date;
        this.time = time;
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.garlicKnots = garlicKnots;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public int getGarlicKnots() {
        return garlicKnots;
    }

    public void setGarlicKnots(int garlicKnots) {
        this.garlicKnots = garlicKnots;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink)
    {
        drinks.add(drink);
    }

    public void addGarlicKnot()
    {
        //
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



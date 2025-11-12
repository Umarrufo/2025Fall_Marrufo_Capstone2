package org.example;

import org.example.ENUMS.Side;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;


public class Order
{
    private LocalDate date;
    private LocalTime time;
    private List<Pizza> pizzas = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private int garlicKnots;

    public Order(LocalDate date, LocalTime time, List<Pizza> pizzas, List<Drink> drinks, int garlicKnots) {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.garlicKnots = garlicKnots;
    }

    public Order() {
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

    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink)
    {
        drinks.add(drink);
    }

    public void addGarlicKnot(int amount)
    {
        this.garlicKnots += amount;
    }

    public double orderPrice()
    {
        var pizzaCost = pizzas.stream().mapToDouble(Pizza::getPrice).sum();
        var drinkCost = drinks.stream().mapToDouble(Drink::getPrice).sum();
        var garlicKnotsCost = garlicKnots * 1.5;

        return pizzaCost + drinkCost + garlicKnotsCost;
    }

}



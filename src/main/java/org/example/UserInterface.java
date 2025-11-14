package org.example;

import org.example.ENUMS.*;

import java.util.List;
import java.util.Scanner;

public class UserInterface
{
    private Order order = new Order();

    public UserInterface()
    {
    }

    public void display()
    {
        Scanner scanner = new Scanner(System.in);

        boolean isDisplayRunning = true;

        while (isDisplayRunning)
        {
            System.out.println("\nPlease Choose an Option:");
            System.out.println("1)  Make an Order");
            System.out.println("2)  Exit");

            String mainMenuInput = scanner.nextLine();

            if (mainMenuInput.isBlank())
            {
                System.out.println("Please type something in.");
                continue;
            }

            switch (mainMenuInput)
            {
                case "1":
                    processGetMakeOrder();
                    break;
                case "2":
                    isDisplayRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice - Please Try Again");

            }
        }
    }

    public void processGetMakeOrder()
    {
        Scanner scanner = new Scanner(System.in);

        boolean isMakeOrderRunning = true;

        while (isMakeOrderRunning)
        {
            System.out.println("\nPlease choose an option:");
            System.out.println("1) Add Pizza");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            String mainMenuInput = scanner.nextLine();

            if (mainMenuInput.isBlank())
            {
                System.out.println("Please type something in.");
                continue;
            }

            switch (mainMenuInput)
            {
                case "1":
                    processGetPizzaMaker();
                    break;
                case "2":
                    processGetAddDrink();
                    break;
                case "3":
                    processGetAddGarlicKnots();
                    break;
                case "4":
                    processGetCheckout();
                    isMakeOrderRunning = false;
                    break;
                case "0":
                    processGetCancelOrder();
                    break;
                default:
                    System.out.println("Invalid Choice - Please Try Again");

            }
        }
    }

    public void processGetPizzaMaker()
    {
        Scanner scanner = new Scanner(System.in);
        Pizza.Builder builder = new Pizza.Builder();

        boolean isPizzaMakerRunning = true;

        while (isPizzaMakerRunning)
        {
            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Pizza Prices", "8\" - Small", "12\" - Medium", "16\" - Large");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Crust", "8.50", "12.00", "16.50");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Thin", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Regular", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Thick", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Cauliflower", "", "", "");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Select a Pizza Size: Small - Medium - Large");
            builder.setPizzaSize(PizzaSize.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("Please Select a Crust: ");
            builder.setCrust(Crust.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Toppings", "8\" - Small", "12\" - Medium", "16\" - Large");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Meats", "1.00", "2.00", "3.00");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Pepperoni", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Sausage", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Ham", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Bacon", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Chicken", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Meatball", "", "", "");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Extra Meat", ".50", "1.00", "1.50");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Select Your Meat:");
            builder.setMeats(List.of(Meat.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Would you like Extra Meat?(Yes/No)");
            String extraMeatInput = scanner.nextLine();
            if(extraMeatInput.equalsIgnoreCase("Yes"))
            {
                builder.setExtraMeat(true);
            }

            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Cheese", "8\" - Small", "12\" - Medium", "16\" - Large");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", " ", ".75", "1.50", "2.25");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Mozzarella", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Parmesan", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Ricotta", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Goat Cheese", "", "", "");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "- Buffalo", "", "", "");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s%n", "Extra Cheese", ".30", ".60", ".90");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Select Your Cheese");
            builder.setCheeses(List.of(Cheese.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Would you like Extra Cheese?(Yes/No)");
            String extraCheeseInput = scanner.nextLine();
            if(extraCheeseInput.equalsIgnoreCase("Yes"))
            {
                builder.setExtraCheese(true);
            }

            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "Regular Toppings", "8\" - Small", "12\" - Medium", "16\" - Large");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s %-15s %-15s %-15s%n", " ", "Included", "Included", "Included");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Onions", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Mushrooms", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Bell peppers", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Olives", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Tomatoes", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Spinach", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Basil", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Pineapple", "", "", "");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "- Anchovies", "", "", "");
            System.out.println("------------------------------------------------------------");

            boolean addToppingsInput = true;
            while(addToppingsInput)
            {
                System.out.println("Please Select Your Topping(s) or Press Enter: ");
                String input = scanner.nextLine().toUpperCase();
                if (input.isBlank())
                {
                    addToppingsInput = false;
                }
                else
                {
                    Topping topping = Topping.valueOf(input);
                    builder.addToppings(topping);
                }
            }

            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s%n", "Sauces", "8\"", "12\"", "16\"");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s%n", " ", "Included", "Included", "Included");
            System.out.printf("%-20s%n", "- Marinara");
            System.out.printf("%-20s%n", "- Alfredo");
            System.out.printf("%-20s%n", "- Pesto");
            System.out.printf("%-20s%n", "- BBQ");
            System.out.printf("%-20s%n", "- Buffalo");
            System.out.printf("%-20s%n", "- Olive Oil");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Select Your Sauce: ");
            builder.setSauces(List.of(Sauce.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s%n", "Sides", "8\"", "12\"", "16\"");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s%n", " ", "Included", "Included", "Included");
            System.out.printf("%-20s%n", "- Red Pepper");
            System.out.printf("%-20s%n", "- Parmesan");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Select Your Side: ");
            builder.setSides(List.of(Side.valueOf(scanner.nextLine().toUpperCase())));

            Pizza newPizza = builder.build();

            order.addPizza(newPizza);

            isPizzaMakerRunning = false;
        }
    }

    public void processGetAddDrink()
    {
        Scanner scanner = new Scanner(System.in);

        boolean isAddDrinkRunning = true;

        while (isAddDrinkRunning)
        {
            System.out.println("\n------------------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s%n", "Other Products", "Small", "Medium", "Large");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s %-15s %-15s %-15s%n", "Drinks", "2.00", "2.50", "3.00");
            System.out.println("------------------------------------------------------------");

            System.out.println("Please Choose the Size of Your Drink: ");
            String drinkSize = scanner.nextLine().toUpperCase();

            DrinkSize drink = DrinkSize.valueOf(drinkSize);
            Drink newDrink = new Drink(drink);

            order.addDrink(newDrink);

            isAddDrinkRunning = false;
        }
    }

    public void processGetAddGarlicKnots()
    {
        Scanner scanner = new Scanner(System.in);

        boolean isAddGarlicKnotsRunning = true;

        while (isAddGarlicKnotsRunning) {
            System.out.printf("\n%-20s %-15s %-15s %-15s%n", "Garlic Knots", "1.50 Each", "", "");
            System.out.println("------------------------------------------------------------");

            System.out.println("How Many Garlic Knots Would You Like?");
            int numOfGarlicKnots = scanner.nextInt();
            scanner.nextLine();

            order.addGarlicKnot(numOfGarlicKnots);

            isAddGarlicKnotsRunning = false;
        }
    }

    public void processGetCheckout()
    {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.println();

        order.getPizzas().forEach(System.out::println);

        order.getDrinks().forEach(System.out::println);

        if (order.getGarlicKnots() > 0)
        {
            System.out.println("\nGarlic Knots: " + order.getGarlicKnots());
        }

        System.out.println("\nTotal: $" + order.orderPrice());

        boolean checkOut = true;
        while(checkOut)
        {
            System.out.println("\nChoose an Option:");
            System.out.println("1) Confirm Order");
            System.out.println("2) Cancel Order");
            String checkOutInput = scanner.nextLine();
            switch(checkOutInput)
            {
                case "1":
                    fileManager.saveOrder(order);
                    order = new Order();
                    checkOut = false;
                    break;
                case "2":
                    processGetCancelOrder();
                    checkOut = false;
                    break;
            }
        }
    }

    public void processGetCancelOrder()
    {
        order = new Order();
    }
}
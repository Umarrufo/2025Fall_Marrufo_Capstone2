package org.example;

import org.example.ENUMS.*;

import java.util.List;
import java.util.Scanner;

public class UserInterface
{

    public UserInterface()
    {
        init();
    }

    private void init()
    {
//        FileManager fileManager = FileManager();
//        this.pizza = fileManager.getPizza;
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
                    break;
                case "0":
                    processGetCancelOrder();
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
            System.out.println("Please Select a Pizza Size: ");
            builder.setPizzaSize(PizzaSize.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("Please Select a Crust: ");
            builder.setCrust(Crust.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("Please Select your Primary Meat");
            builder.setMeats(List.of(Meat.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Select Another Meat or Press (Enter) to Continue");
            builder.setMeats(List.of(Meat.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Please Select your Primary Cheese");
            builder.setCheeses(List.of(Cheese.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Select Another Cheese or Press (Enter) to Continue");
            builder.setCheeses(List.of(Cheese.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Please Select your Toppings: ");
            builder.setToppings(List.of(Topping.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Please Select your Sauces: ");
            builder.setSauces(List.of(Sauce.valueOf(scanner.nextLine().toUpperCase())));

            System.out.println("Please Select your Sides: ");
            builder.setSides(List.of(Side.valueOf(scanner.nextLine().toUpperCase())));

        }
    }

    public void processGetAddDrink()
    {
        //
    }

    public void processGetAddGarlicKnots()
    {
        //
    }

    public void processGetCheckout()
    {
        //
    }

    public void processGetCancelOrder()
    {
        //
    }
}
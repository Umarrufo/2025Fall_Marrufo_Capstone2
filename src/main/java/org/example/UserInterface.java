package org.example;

import java.util.Scanner;

public class UserInterface {
    private Pizza pizza;

    public UserInterface() {
        init();
    }

    private void init() {
//        FileManager fileManager = FileManager();
//        this.pizza = fileManager.getPizza;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        boolean isDisplayRunning = true;

        while (isDisplayRunning) {
            System.out.println("\nPlease Choose an Option:");
            System.out.println("1)  Make an Order");
            System.out.println("2)  Exit");

            String mainMenuInput = scanner.nextLine();

            if (mainMenuInput.isBlank()) {
                System.out.println("Please type something in.");
                continue;
            }

            switch (mainMenuInput) {
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

    public void processGetMakeOrder() {
        Scanner scanner = new Scanner(System.in);

        boolean isMakeOrderRunning = true;

        while (isMakeOrderRunning) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1) Add Pizza");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Garlic Knots");
            System.out.println("4) Checkout");

            String mainMenuInput = scanner.nextLine();

            if (mainMenuInput.isBlank()) {
                System.out.println("Please type something in.");
                continue;
            }

            switch (mainMenuInput) {
                case "1":
                    processGetMakePizza();
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

    public void processGetMakePizza()
    {
        Scanner scanner = new Scanner(System.in);
        Pizza.Builder builder = new Pizza.Builder();

        boolean isMakePizzaRunning = true;

        while (isMakePizzaRunning)
        {
            System.out.println("Please Select a Pizza Size: ");


            System.out.println("Please Select a Crust: ");
            int crust = scanner.nextInt();

            System.out.println("Please Select your Primary Meat");
            int meat = scanner.nextInt();

            System.out.println("Select Another Meat or Press (V) to Continue");
            int extraMeat = scanner.nextInt(); //for loop

            System.out.println("Please Select your Primary Meat");
            int cheese = scanner.nextInt();

            System.out.println("Select Another Meat or Press (V) to Continue");
            int extraCheese = scanner.nextInt(); //for loop

            System.out.println("Please Select your Toppings: ");


            System.out.println("Please Select your Sauces: ");


            System.out.println("Please Select your Sides: ");
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
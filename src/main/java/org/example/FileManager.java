package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class FileManager
{
    public void saveOrder(Order order)
    {
        //File writer used when asking for user input
        try
        {
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            FileWriter fileWriter = new FileWriter("src/main/resources/receipt.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Date: " + order.getDate()
                    + "\tTime: " + order.getTime().format(timeFormatter));
            bufferedWriter.newLine();

            //[0] = size, [1] = crust, [2] = meat, [3] = extra meat, [4] = cheese
            // [5] extra cheese, [6] = toppings, [7] = sauce, [8] = side
            for(Pizza pizza : order.getPizzas())
            {
                bufferedWriter.write("Pizza Size: " + pizza.getPizzaSize()
                        + "\nCrust: " + pizza.getCrust()
                        + "\nMeat: " + pizza.getMeats()
                        + "\nExtra Meat: " + pizza.isExtraMeat()
                        + "\nCheese: " + pizza.getCheeses()
                        + "\nExtra Cheese: " + pizza.isExtraCheese()
                        + "\nToppings: " + pizza.getToppings()
                        + "\nSauce: " + pizza.getSauces()
                        + "\nSide: " + pizza.getSides()
                        + "\nPrice: $" + pizza.getPrice());
                bufferedWriter.newLine();
            }

            //[0] = size
            for(Drink drink : order.getDrinks())
            {
                bufferedWriter.write("Drink Size : " + drink.getSize() + "\t\tPrice: $" + drink.getPrice());
                bufferedWriter.newLine();
            }

            if (order.getGarlicKnots() > 0)
            {
                bufferedWriter.write("Garlic Knots: " + order.getGarlicKnots()
                        + "\t\tPrice: $" + (order.getGarlicKnots() * 1.5));
                bufferedWriter.newLine();
            }

            bufferedWriter.write("Total: $" + order.orderPrice());
            bufferedWriter.newLine();
            bufferedWriter.newLine();

            bufferedWriter.close();

        }
        catch(IOException ex)
        {
            System.out.println("Something went wrong with the file, try again");
        }
    }
}

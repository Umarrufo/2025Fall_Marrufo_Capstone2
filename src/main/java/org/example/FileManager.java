package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager
{
    public void saveOrder(Order order)
    {
        //File writer used when asking for user input
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String filename = "src/main/resources/" + LocalDateTime.now().format(formatter) + ".txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

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
                bufferedWriter.write("\nDrink Size : " + drink.getSize() + "\t\tPrice: $" + drink.getPrice());
                bufferedWriter.newLine();
            }

            if (order.getGarlicKnots() > 0)
            {
                bufferedWriter.write("\nGarlic Knots: " + order.getGarlicKnots()
                        + "\t\tPrice: $" + (order.getGarlicKnots() * 1.5));
                bufferedWriter.newLine();
            }

            bufferedWriter.write("\nTotal: $" + order.orderPrice());
            bufferedWriter.newLine();

            bufferedWriter.close();

        }
        catch(IOException ex)
        {
            System.out.println("Something went wrong with the file, try again");
        }
    }
}

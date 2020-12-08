    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Class: 44542-01 Object Oriented Programming
 * @author Sreenidhi Madala
 * 
 */
public class OrdersDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println("*****************************************************");
        System.out.println("*********************** MS-ACS PIZZA CORNER *********");
        System.out.println("*****************************************************");
        while (sc.hasNext()) {
            //2. Declare and initialize an OrderSummary object and name it as orderSum
            OrdersSummary orderSum = new OrdersSummary();
            //3. Read date and pass the date to the getOrderDayOfWeek method
            String date = sc.nextLine();
            Days.getOrderDayOfWeek(date);

           String pizzas = sc.nextLine();
            if (pizzas.equalsIgnoreCase("Handtossed pizza")) {
                pizzas = "HANDTOSSED_PIZZA";
            } else if (pizzas.equalsIgnoreCase("pan pizza")) {
                pizzas = "PAN_PIZZA";
            }
            PizzaTypes pizzaTypes = PizzaTypes.valueOf(pizzas);
             String size = sc.next();
            Integer number = sc.nextInt();
            sc.nextLine();

            String sauce = sc.nextLine();
            Sauces sauces = Sauces.valueOf(sauce.toUpperCase().replace(" ", "_"));
            String sides = sc.nextLine();
            String abc = sides.substring(0, sides.indexOf("-"));
            Sides side = Sides.valueOf((abc.toUpperCase().trim()).replace(" ", "_"));

            Order order = new Order(pizzaTypes, size, number, sauces, side, sidesSize, drink, cheeses, desserts);
            orderSum.addAOrder(order);
            System.out.println(orderSum.printReceipt(date));
        }

    }
}

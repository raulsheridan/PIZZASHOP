/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.Scanner;

/**
  Review class for Final Exam Part D review.
 * Creates a pizza of a given type and cuts it into slices.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye, 2019
 */


/*NEW AUTOHR RAUL*/

public class PizzaShop {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();
        
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new Pizza();
            pizza.addTopping("cheese");
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new Pizza();
            pizza.addTopping("cheese");
            pizza.addTopping("pepperoni");
        }
        
        PizzaCutter pizzaCutter = PizzaCutter.getInstance();
        
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pizzaCutter.setNumSlices(numSlices);
        
        if (pizza != null) {
            System.out.println("Great job, here is your pizza in " + numSlices + " slices");
        } else {
            System.out.println("Enter a valid pizza type so we can make it for you!");
        }
    }//end main
}
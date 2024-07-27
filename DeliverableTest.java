package deliverabletest;

import pizza.foodItems.Cheese;
import pizza.foodItems.FoodItem;
import pizza.foodItems.GreenPepper;
import pizza.foodItems.Ham;
import pizza.foodItems.Olive;
import pizza.foodItems.Onion;
import pizza.foodItems.Pepperoni;
import pizza.foodItems.Pizza;
import pizza.foodItems.SudsOrder;
import pizza.services.*;


/**
 * This class is testing the functionality of Deliverable interface
 * and its implementing classes "Pizza" and "SudsOrder".
 * @author Muhammed Ozturk
 */

/**
 * Test our deliverable interface and inheritance heirarchy for the pizza shop
 * app.
 */
public class DeliverableTest {
	final static boolean THIN_CRUST = true;

	/**
	 * Main entry point for testing aspects of our pizza shop app.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * 	Setup some toppings for pizza's
		 * 		onion, cheese, double cheese, pepperoni, ham, olive and green pepper
		 */
		Onion onion = new Onion("Onion");
		onion.setPricePerUnit(2.0);
		onion.setQuantity(1);
		onion.setUnitsOfMeasure("1/2 CUP");;

		Cheese cheese = new Cheese("Cheese");
		cheese.setPricePerUnit(2.75);
		cheese.setQuantity(1);
		cheese.setUnitsOfMeasure("1/2 CUP");;

		Cheese dblCheese = new Cheese("Double Cheese");
		dblCheese.setPricePerUnit(2.75);
		dblCheese.setQuantity(2);
		dblCheese.setUnitsOfMeasure("CUP");;

		Pepperoni pepperoni = new Pepperoni("Pepperoni");
		pepperoni.setPricePerUnit(3.75);
		pepperoni.setQuantity(1);
		pepperoni.setUnitsOfMeasure("CUP");;

		Ham ham = new Ham("Ham");
		ham.setPricePerUnit(2.75);
		ham.setQuantity(2);
		ham.setUnitsOfMeasure("CUP");;

		Olive olive = new Olive("Olive");
		olive.setPricePerUnit(1.75);
		olive.setQuantity(1);
		olive.setUnitsOfMeasure("CUP");;

		GreenPepper greenPepper = new GreenPepper("GreenPepper");
		greenPepper.setPricePerUnit(2.80);
		greenPepper.setQuantity(1);
		greenPepper.setUnitsOfMeasure("CUP");;

		/**
		 * Creating the pizza order.
		 */
		Pizza pizzaPesto = new Pizza(12, "pesto");
		pizzaPesto.setBasePrice(25.00);
		pizzaPesto.setThinCrust(Pizza.THIN_CRUST);
		pizzaPesto.addTopping(dblCheese);
		pizzaPesto.addTopping(pepperoni);
		pizzaPesto.addTopping(ham);
		pizzaPesto.addTopping(greenPepper);

		Pizza pizzaMarinara = new Pizza(14, "marinara");
		pizzaMarinara.setBasePrice(35.25);
		pizzaMarinara.setThinCrust(Pizza.THIN_CRUST);
		pizzaMarinara.addTopping(onion);
		pizzaMarinara.addTopping(ham);
		pizzaMarinara.addTopping(cheese);
		pizzaMarinara.addTopping(olive);

		/**
		 * Initialization of the array of Deliverable interface.
		 * 
		 */
		Deliverable[] deliverableItems = { pizzaPesto, pizzaMarinara,
				new SudsOrder("Rollicking Root Beer", 6),
				new SudsOrder("Super Citrus Fizz", 4) };

		int pizzaCount = 1;

			
		/**
		 * Column names of the table
		 */
		System.out.printf("%-33s %-9s %s\n", "Item-Sauce", "#/Size", "Cost");

		

		/**
		 * Details of pizza and toppings.
		 */
		for (Deliverable item : deliverableItems) {
		    if (item instanceof Pizza) {
		        Pizza pizza = (Pizza) item;
		        
		        
		        
		        /**
		         * Pizza details about sauce, size, price, cost.
		         * All data is aligned according to column names of table.
		         */
		        System.out.printf("Pizza %d-%-27s %2d     %6.2f - Delivery (%6.2f) Total->>$%7.2f\n",
		                pizzaCount,
		                pizza.getTypeOfSauce(),
		                pizza.getSizeInInches(),
		                pizza.getBasePrice(),
		                pizza.deliveryCost(),
		                pizza.totalPrice());

		        /**
		         * Iterates the list of toppings added to object.
		         * Prints toppings with format specific for the table.
		         */
		        for (FoodItem topping : pizza.getToppings()) {
		            System.out.printf("      - %-35s%5.2f\n", topping.getName(), topping.price());
		        }
		        
		     /**
		      * Increasing the pizza counter
		      */
		        pizzaCount++; 
		    } else if (item instanceof SudsOrder) {
		        SudsOrder sudsOrder = (SudsOrder) item;
		        
		        // Prints suds order details
		        System.out.printf("%-34s %2d     %6.2f\n",
		                sudsOrder.getName(),
		                sudsOrder.getNumber(),
		                sudsOrder.totalPrice());
		    }
		}
	}
}
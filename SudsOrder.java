package pizza.foodItems;

import pizza.services.Deliverable;


/**
 * "Sudsorder" class represents beverages. "Rollicking Root Beer"
 * and "Super Citrus Fizz"
 * @author Muhammed Ozturk
 */
public class SudsOrder implements Deliverable {
	private final String name;
	private final int number;
	
	
	/**
	 * Constructs a new SudsOrder instance with a name and number. 
	 * Name and number are specified.
	 * @param name
	 * @param number
	 * @param sizeInML
	 */
	public SudsOrder(String name, int number)	{
		this.name=name;
		this.number=number;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the sizeInML
	 */
	
	/**
	 * Calculates the delivery cost of the orders.
	 * @return
	 */
	@Override
	public double deliveryCost()	{
		return number*0.75;
	}
	
	/**
	 * Total price for the suds order.
	 * @return
	 */
	public double totalPrice()	{
		return deliveryCost();
	}
	
	
	/**
	 * Price of the order which is based on the number of units.
	 * @return
	 */
	public double price() {
		double pricePerUnit = 3.0;
		return number*pricePerUnit;
	}
	
	
	/**
	 * String representation of the order.
	 * @return
	 */
	public String toString()	{
		return String.format("%s x%d", name, number);
	}
}

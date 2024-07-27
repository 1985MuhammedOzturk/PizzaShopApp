package pizza.foodItems;

import pizza.services.Deliverable;
import java.util.ArrayList;
import java.util.List;



/**
 * "Pizza" class includes size, sauce type, crust, toppings.
 * @author Muhammed Ozturk
 */
public class Pizza implements Deliverable {
	public static final boolean THIN_CRUST = true;
	private int sizeInInches;
	private String typeOfSauce;
	private boolean thinCrust;
	private List<FoodItem> toppings;
	private double basePrice;
	
	/**
	 * Constructs a new pizza. The pizza is initiated with thin crust 
	 * and no toppings. 
	 * @param size
	 * @param sauce
	 */
	public Pizza(int size, String sauce)	{
		this.sizeInInches = size;
		this.typeOfSauce = sauce;
		this.thinCrust = THIN_CRUST;
		this.toppings = new ArrayList<>();
		
	}
	
	/**
	 * Sets the price of the pizza.
	 * @param price
	 */
	public void setBasePrice(double price) 	{
		this.basePrice = price;
		
	}	
	
	/**
	 * This method adds topping to the initiated pizza with thin crust
	 * and no toppings
	 * @param item
	 */
		public void addTopping(FoodItem item)	{
			toppings.add(item);
		
	}
		
		/**
		 * Calculates and returns the delivery cost for the 
		 * pizza according to its size.
		 * @return
		 */
		public double deliveryCost()	{
			switch (sizeInInches)	{
			case 10:
				return 2.50;
			case 12:
				return 3.50;
			case 14:
				return 4.75;
			default:
				return 0.0;
									
			}
		}
		
		/**
		 * Calculates and returns the total price of the pizza
		 * base price + all added topppings. 
		 * @return
		 */
		public double price()	{
			double toppingsPrice = toppings.stream().mapToDouble(FoodItem::price).sum();
			return basePrice + toppingsPrice;
			
		}
		
		/**
		 * This method calculates the grand total.
		 * pizza + delivery cost
		 * @return
		 */
		public double totalPrice()	{
			return price() + deliveryCost();
		}
		
		
		/**
		 * String representation for the Pizza object.
		 * All features of the pizza is included
		 * Size, sauce, crust, topppings, base price, delivery cost, 
		 * @return
		 */
		public String toString() {
			
	        StringBuilder sb = new StringBuilder();
	        
	        sb.append("Pizza ").append(sizeInInches).append("-inch ").append(typeOfSauce);
	        
	        if (thinCrust) {
	        	
	            sb.append(" (Thin Crust)");
	        }
	        sb.append("\nToppings:");
	        
	        for (FoodItem topping : toppings) {
	        	
	            sb.append("\n- ").append(topping.getName()).append(": $").append(String.format("%.2f", topping.price()));
	        }
	        sb.append("\nBase Price: $").append(String.format("%.2f", basePrice));
	        
	        sb.append("\nDelivery Cost: $").append(String.format("%.2f", deliveryCost()));
	        
	        
	        sb.append("\nTotal Price: $").append(String.format("%.2f", totalPrice()));
	        
	        	return sb.toString();
	        	
	    }

		/**
		 * @param thinCrust is the thinCrust to set
		 */
		public void setThinCrust(boolean thinCrust) {
			this.thinCrust = thinCrust;
		}

		/**
		 * @return the sizeInInches
		 */
		public int getSizeInInches() {
			return sizeInInches;
		}

		/**
		 * @param sizeInInches is the sizeInInches to set
		 */
		public void setSizeInInches(int sizeInInches) {
			this.sizeInInches = sizeInInches;
		}

		/**
		 * @return the typeOfSauce
		 */
		public String getTypeOfSauce() {
			return typeOfSauce;
		}

		/**
		 * @param typeOfSauce the typeOfSauce to set
		 */
		public void setTypeOfSauce(String typeOfSauce) {
			this.typeOfSauce = typeOfSauce;
		}

		/**
		 * @return the toppings
		 */
		public List<FoodItem> getToppings() {
			return toppings;
		}

		/**
		 * @param toppings the toppings to set
		 */
		public void setToppings(List<FoodItem> toppings) {
			this.toppings = toppings;
		}

		/**
		 * @return the thinCrust
		 */
		public static boolean isThinCrust() {
			return THIN_CRUST;
		}

		

		/**
		 * @return the basePrice
		 */
		public double getBasePrice() {
			return basePrice;
		}

		
		
		
}

package pizza.services;

/**
 * Deliverable interface represents the deliverable items. 
 * @author Muhammed Ozturk
 */

public interface Deliverable {
	
	/**
	 * Calculating the cost of delivery.
	 * @return
	 */
	double deliveryCost();
	
	
	/**
	 * Calculating the total price. Food + delivery cost.
	 * @return
	 */
	double totalPrice();

}

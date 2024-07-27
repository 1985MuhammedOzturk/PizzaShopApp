package pizza.foodItems;


/**
 * "FoodItem" class includes name, measurement unit, quntity 
 * and price per unit for the food items.
 * @author Muhammed Ozturk
 */

public class FoodItem {
	protected String name;
	protected String unitsOfMeasure;
	protected float quantity;
	protected double pricePerUnit;
	
	/**
	 * 
	 * @param name
	 */
	public FoodItem(String name)	{
		this.name = name;
		
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the unitsOfMeasure
	 */
	public String getUnitsOfMeasure() {
		return unitsOfMeasure;
	}


	/**
	 * @param unitsOfMeasure the unitsOfMeasure to set
	 */
	public void setUnitsOfMeasure(String unitsOfMeasure) {
		this.unitsOfMeasure = unitsOfMeasure;
	}


	/**
	 * @return the quantity
	 */
	public float getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the pricePerUnit
	 */
	public double getPricePerUnit() {
		return pricePerUnit;
	}


	/**
	 * @param pricePerUnit the pricePerUnit to set
	 */
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	public double price()	{
		return quantity*pricePerUnit;
	}
}

/**
 * 
 */
package se.mah.k3;

/**
 * This class describes a Bike and is built for use in a bikestore application
 * @author K3LARA
 *
 */
public class Bike {

	/**
	 * 
	 */
	private String color;
	private int price;
	private int size;
	private static int nbrOFBikes;
	
	
	/**Creates a Bike instance-variables are limited by values in Contants.java*/ 
	public Bike(String color, int size) {
		this(color,size,0);
	}
	

	
	/**Creates a Bike with instance-variables limited by values in Contants.java*/
	public Bike(String color, int size,int price){
		this.color = Constants.checkValidColor(color);
		//this checks should more beautifully be done in Contants 
		if (price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
		     this.price = price;
		} else {
			this.price = Constants.DEFAULT_PRICE;
		}
		if (size > Constants.MIN_SIZE && size < Constants.MAX_SIZE){
		     this.size = size;
		} else {
			this.size = Constants.DEFAULT_SIZE;
		}
		nbrOFBikes = nbrOFBikes +1;
	}
	
	public int getPrice() {
		return price;
	}

	/**Sets price limited to values in Constants.java*/
	public void setPrice(int price) {
		if (price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
		     this.price = price;
		} else {
			this.price = Constants.DEFAULT_PRICE;
		}
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}
	/**Total number of instances created*/
	public static int getNbrOFBikes() {
		return nbrOFBikes;
	}
}

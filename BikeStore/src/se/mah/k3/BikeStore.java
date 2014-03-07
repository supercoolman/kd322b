/**
 * 
 */
package se.mah.k3;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author K3LARA
 *
 */
public class BikeStore {
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	/** Returns a formatted string with rowbrake with all bikes*/
	public String getAllBikes() {
		String s = "";
		for (Bike bike : bikes) {
			s= s+ "\n One " +bike.getColor()+ " " + bike.getSize() + "\" bike that costs "+bike.getPrice() + " £.";
		}
		return s;
	}
  
	/**Adds an new Bike, Constants.java for controlling input see class Bike for more info*/ 
	public void addBike(String color, int size, int price){
		bikes.add(new Bike(color,size,price));
	}
	
}
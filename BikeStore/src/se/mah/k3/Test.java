package se.mah.k3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Bike> myBikes = new ArrayList<Bike>(); 
		myBikes.add(new Bike("Red",23,1400));
		myBikes.add(new Bike("green",23,1401));
		myBikes.add(new Bike("Black",23,250000));
		myBikes.add(new Bike("bLUE",23,14003));
		myBikes.add(new Bike("Red5",23,1404));
		myBikes.add(new Bike("Red6",23,-300));
		myBikes.add(new Bike("Red7",23,1500));
		myBikes.add(new Bike("white",23,1500));
		myBikes.add(new Bike("green",23,1600));
		myBikes.add(new Bike("Blue",23,1700));
		myBikes.add(new Bike("Green",22,1800));
		myBikes.add(new Bike("Bleck",28,1400));
		
		System.out.println("Förenklad for-loop");
		for (Bike bike : myBikes) {
			System.out.println("En " +bike.getColor()+ " " + bike.getSize() + "\" cykel som kostar "+bike.getPrice() + " kr.");
		}
		
		System.out.println("\nStandard Forloop");
		for (int i = 0; i < myBikes.size(); i++){
			Bike b = myBikes.get(i);
			System.out.println("En " +b.getColor()+ " " + b.getSize() + "\" cykel som kostar "+b.getPrice() + " kr.");
		}
		
		System.out.println("\nTotalt har vi " + myBikes.size() +" cyklar.");
		//Eller
		System.out.println("\nTotalt har vi " + Bike.getNbrOFBikes() +" cyklar.");
	}

}

package se.mah.k3;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare and create this must be done in this method since it i static
		BikeStore bikeStore = new BikeStore();
		//Add the bikes
		bikeStore.addBike("Red",23,1400);
		bikeStore.addBike("BLUE",3,140000);
		bikeStore.addBike("Black",18,14);
		bikeStore.addBike("Green",25,1);
		bikeStore.addBike("white",26,20);
		bikeStore.addBike("yellow",14,1355);
		bikeStore.addBike("Hollow",60,1643);
		bikeStore.addBike("Cool",23,1463);
		//Print it
		System.out.println(bikeStore.getAllBikes());
	}

}

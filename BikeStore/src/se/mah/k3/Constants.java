package se.mah.k3;

public class Constants {
 
	/**Max allowed price for a bike*/
	public static final int MAX_PRICE = 30000;
	/**Min allowed price for a bike*/
	public static final int MIN_PRICE = 100;
	/**Price is set to this value if outside price-range*/
	public static final int DEFAULT_PRICE = 0;
	/**Min allowed size for a bike*/
	public static final int MIN_SIZE = 10;
	/**Max allowed size for a bike*/
	public static final int MAX_SIZE = 28;
	/**Size is set to this value if outside size-range*/
	public static final int DEFAULT_SIZE = 28;
	/**ColorsAllowed using enum*/
	public static enum ALLOWED_C {green,white,blue,red};
	
	public static final String[] ALLOWED_COLORS =  {"black","blue","red","green"};
	/**Color used if no color entered*/
	private static final String DEFAULT_COLOR_STRING = "No color inserted";
	
	/**Checks if color given is valid returns the color in lower case or returns default color
	 * if color is not valid*/
	public static String checkValidColor(String color){
		color = color.toLowerCase();
		boolean foundColor = false;
		for (int i = 0; i < ALLOWED_COLORS.length; i++) {
			if (color.equals(ALLOWED_COLORS[i])){
				foundColor = true;
			}
		}
		if (foundColor){
			return color;
		} else {
			return DEFAULT_COLOR_STRING;
		}
	}
	
}
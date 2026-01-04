public class Food{ // declare public (accessible to other files within the package) class Food
	private double price; // declare private (only accessible within the class) double
	private double gramsFat; // declare private double
	private double gramsCarbs; // declare private double
	private double gramsProtein; // declare private double
	
	public Food(double p, double gFat, double gCarbs, double gProtein){ // declare a public constructor that has 4 double parameters
        price = p; // set price equal to the first arg
        gramsFat = gFat; // set gramsFat equal to the second arg
        gramsCarbs = gCarbs; // set gramsCarbs equal to the third arg
        gramsProtein = gProtein; // set gramsProtein equal to the fourth arg
	} // close constructor
	
	public double getPrice(){ // declare getter method that returns a double 
		return price; // return private double price
	} // close method
	
	public double getGramsFat(){ // declare getter method that returns a double 
		return gramsFat; // return private double gramsFat
	} // close method
	
	public double getGramsCarbs(){ // declare getter method that returns a double 
		return gramsCarbs; // return private double gramsCarbs
	} // close method
	
	public double getGramsProtein(){ // declare getter method that returns a double 
		return gramsProtein; // return private double gramsProtein
	} // close method

	public String toString(){ // declare a method that returns a String
		String str = gramsFat+"g of fat, "+gramsCarbs+"g of carbs, and "+gramsProtein+"g of protein."; // init a string including fat, carb, and protein data
		return str; // return the string
	} // close method

} // close class
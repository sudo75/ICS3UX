public class Food{
	private double price;
	private double gramsFat;
	private double gramsCarbs;
	private double gramsProtein;
	
	public Food(double p, double gFat, double gCarbs, double gProtein){
        price = p;
        gramsFat = gFat;
        gramsCarbs = gCarbs;
        gramsProtein = gProtein;
	}
	
	public double getPrice(){
		return price;		
	}
	
	public double getGramsFat(){
		return gramsFat;
	}
	
	public double getGramsCarbs(){
		return gramsCarbs;
	}
	
	public double getGramsProtein(){
		return gramsProtein;
	}

	public String toString(){
		String str = gramsFat+"g of fat, "+gramsCarbs+"g of carbs, and "+gramsProtein+"g of protein.";
		return str;
	}

}
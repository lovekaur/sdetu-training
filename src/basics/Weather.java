package basics;

public class Weather {
    
	public static void main(String[] args) {
		
		// This program will tell what to wear based on the weather (Temperature)
		
		int temperature = 60 ;
		//String sunCondition = "sunny"
			
			if (temperature > 80) {
				System.out.println("It's pleasent. wear shots and t-shirt");
				
			}
			else if (temperature > 60) {
				System.out.println("Looks like its little cooler out side. Wear jeans and long seleves shirt");
			}
			else{
				System.out.println("Looks like its cooler out side. Wear jacket");
			}
	}
}

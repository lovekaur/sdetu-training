package basics;

public class array {
      
	public static void main (String [] args) {
		// Declare the array
		
		String[] cities = {"ludhiana","khana","moga","jamalpur"};
		System.out.println (cities[0]);
		System.out.println (cities[1]);
		System.out.println (cities[2]);
		System.out.println (cities[3]);
		
		//Define & declare the array (only size)
		String[] villages = new String[3];
		villages[0] = "daad";
		villages[1] = "lalton";
		villages[2] = "lodhan";
        System.out.println(villages[0]);
		
		//declare the array
        String[ ] countries;
       
        //define the array
        countries = new String[3];
        countries[0] = "uk";
        countries[1] = "nz";
        countries[2] = "usa";
        System.out.println(countries[1]);
	}
}
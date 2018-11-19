package basics;

public class loop {
 
	public static void main (String[] args)  {
		//Define & declare the array (only size)
				String[] villages = new String[3];
				villages[0] = "daad";
				villages[1] = "lalton";
				villages[2] = "lodhan";
		        int i=0;
		        
		        //Do loop: enters the loop THEN tests condition. See the example below
		        do {
		        System.out.println("VILLAGES:"+ villages[i]);
		        i = 5;      
		        } while (i<3);
				
		        //While loop: tests condition first then enters loop
		        int j=0;
		        while (j<=3);
		        System.out.println("VILLAGES:"+ villages[j]);
		        
		        String[] pind= new String[3];
				pind[0] = "daad";
				pind[1] = "lalton";
				pind[2] = "lodhan";
		        int y=0;
		        
		        //For loop: consists of three parts i.e variable declaration, condition and then increment/decrement.
		        for (y=0;y<3;y++) {
		        System.out.println(pind[y]);
	         }


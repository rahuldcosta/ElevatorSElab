package elevatorse2015;

import java.util.Scanner;

public class FloorButtonPanel {

	int floorch;
	public FloorButtonPanel(){
		//display();
		floorch=0;
	}
	

public int whichfloor(int limit) {
    	
    	
    	Scanner sc=new Scanner(System.in);
		
		
		//Setting user Floor No
		do{
		System.out.println("[Waiting]Enter Which Floor your on ?");
		floorch=sc.nextInt();	
		
		if(!(floorch>=0 && floorch<limit))
			System.out.println("Invalid Floor No.");
		
		}while(!(floorch>=0 && floorch<limit));
    	return floorch;
    }
	
	
	
	
	
	
}

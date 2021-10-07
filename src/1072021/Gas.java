/*
 * Name: xRqz3r
 * Date: September 23, 2021
 * Title Product
 * Description: 
 */

import java.util.Scanner;

public class Gas {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int km = 0; //
		int litres = 0; //
		int totalKm = 0; //
		int totalLitres = 0; //
		
		double kmPerLitre; //
		double totalKmPerLitre; //
		
		int answer = 1; //
		
		//
		while(answer == 1) {
			
			//
			
			//
			System.out.print("Enter the kilometers driven: ");
			km = input.nextInt();
			
			//
			System.out.print("Enter the litres used: ");
			litres = input.nextInt();
			
			//
			
			//
			kmPerLitre = (double)km/litres;
			
			//
			System.out.printf("The km/litre used was %.2f\n", kmPerLitre);
			
			//
			
			//
			totalKm += km;
			
			//
			totalLitres += litres;
			
			//
				//
			System.out.print("Enter: (1) to continue; or, (2) to quit: ");
			answer = input.nextInt();
			
		}//end of while loop
		
		//
		
		//
		totalKmPerLitre = (double)totalKm/totalLitres;
		
		//
		System.out.printf("The total km/litre used was %.2f\n", totalKmPerLitre);
		
	}// end of main method 

}//end of class

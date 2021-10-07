/*
 * Name: xRqz3r
 * Date: Oct 7, 2021
 * Title Product: Credit
 * Description: 
 */

import java.util.Scanner;

public class Credit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int balance; //
		int charges; //
		int credits; //
		int limit; //
		
		String accNum; //
		
		String another; //
		
		do {
			
			//
			//
			System.out.println("Enter the user's account number:");
			accNum = input.next();
			
			//
			System.out.println("Enter the user's credit limit:");
			limit = input.nextInt();
			
			//
			System.out.println("Enter the user's beginning balance:");
			balance = input.nextInt();
			
			//
			System.out.println("Enter the user's charges:");
			charges = input.nextInt();
			
			//
			System.out.println("Enter the user's credits:");
			credits = input.nextInt();
			
			//
			balance = balance + charges - credits;
			
			//
			System.out.printf("The customer's new balance is $%d \n", balance);
			
			//
			//
			if (balance > limit)
				System.out.printf("Account #%s - Credit limit exceeded!\n", accNum);
			
			//
			System.out.println("Is there another customer? (Y/N)");
			another = input.next();
			 
			//
		} while (another.equalsIgnoreCase("Y"));
		
	}//

}//

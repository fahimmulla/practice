package javapractice;

import java.util.Scanner;

public class Ifstatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get user to input + or - to get answer
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please enter an input");
		
		String sign = input.nextLine();
		
		int firstValue = input.nextInt();
		
		int secondValue = input.nextInt();
		
		
		if(sign.equals ("+")) {
			System.out.println("The addition of : " +  firstValue  + " " + secondValue + "" + " is " + ( firstValue + secondValue) );
		} else if (sign.equals("-")) {
			System.out.println("The subtraction of :" + firstValue + "" + secondValue +"" + "is" + (firstValue - secondValue) );

		} else { 
			System.out.println(" Incorrect input please only put + or -");
			
		}
		
		
	}

}

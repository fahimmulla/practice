package javapractice;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
		    Scanner reader = new Scanner(System.in);
		    
		    System.out.println("Enter an integer");
		    
		    int number= reader.nextInt();
		    
		    if ( number % 2 ==0) {
		        System.out.println("The integer is even");}
		   else {
		    System.out.println("The integer is odd ");}
		    
		}
	}

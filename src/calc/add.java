package calc;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This Calculater can just add two numbers.\n");
		System.out.println("Enter the first Number:");
		
		Scanner scan= new Scanner (System.in);
		int x = scan.nextInt();
		
		System.out.println("Enter the second Number:");
		
		int y= scan.nextInt();
		
		int z= x + y;
		
		System.out.println("\nSummation= " +z);
	}

}

package dhruba;

import java.util.Scanner;

public class Day1DataType {

	public static void main(String[] args) {
		int i=4;
		double d=4.0;
		String s="Hackerrank  ";
		
		
		Scanner scan = new Scanner(System.in);
				
		
		
		
		
		
		System.out.print("Enter the int value  ");
		int i2 = scan.nextInt();
		
		System.out.print("Enter the double value  ");
		double d2 = scan.nextDouble();
		
		scan.nextLine(); 
		System.out.print("Enter the string value  ");
		
		 String s2=scan.nextLine();
		
		System.out.println("sum of int values: "+(i+i2));
		System.out.println("sum of double values: "+(d+d2));
		System.out.println(s+s2);
		
		

		
		
		
		

	}

}

package dhruba;

import java.io.*;
import java.util.*;

public class Day4ClassVsInstance {
    private int age;	
  
	public Day4ClassVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if(initialAge<0) {
			age=0;
			System.out.println("Age is not valid, setting age to 0");
		}else {
		age=initialAge;
	}
	}
	
	

	



	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
       // System.out.println(/*Insert correct print statement here*/);
		
		
		 if(age<13) {
			System.out.println("young");
			
		}
		else if(age>=13 && age<18 ) {
			System.out.println("teeneger");
			
		}
		
		else if(age>18) {
			System.out.println("old");
			
		}


	}

	public void yearPasses() {
  		// Increment this person's age.
		age++;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVsInstance p = new Day4ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

	

package ifElse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Emter the year : ");
		
		int year = sc.nextInt();
		
		if(  (  (year % 4 == 0) && (year % 100 != 0)  ) || (year % 400 == 0)  )
		{
			System.out.println("LEAP YEAR");
		}
			
		else 
		{
			System.out.println("COMMON YEAR");
		}

	}

}

package chapter;

import java.util.Scanner;

public class Project
{

		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the year.");
			String goOn="y";
			while(goOn.equals("y"))
			{
				int currentYear=scan.nextInt();
				if(currentYear<1582)
				{
					System.out.println("Leap year did not exist, you suck.");
				}
				else if((currentYear%400)==0)
				{
					System.out.println("It is a leap year.");
				}
				else if(!((currentYear%4)==0||currentYear%100==0))
				{
					System.out.println("It is a leap year.");
				}
				else
				{
					System.out.println("it is not a leap year.");
				}
			
				System.out.println("Enter 'y' if you want to keep going and 'n' if you do not.");
				goOn=scan.next();
				
			}
		}
}

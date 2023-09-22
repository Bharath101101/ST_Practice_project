package Assisted_Project1;

import java.util.Scanner;

public class base {
		public void area(int l,int w) {
			System.out.println("The area of rectangle is:"+ (l*w));
		}
		public void area(int l)
		{
			
			System.out.println("the area of square is: " + l*l);	
					
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan =new Scanner(System.in);
			System.out.println("enter the length:");
			int l= scan.nextInt();
			System.out.println("enter the width:");
			int w= scan.nextInt();
			
			base obj = new base();
			try {
			obj.area(l, w);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				 obj.area(l);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			scan.close();
		}

	}

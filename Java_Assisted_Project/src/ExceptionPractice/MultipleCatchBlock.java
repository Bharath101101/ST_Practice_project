package ExceptionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the first Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second Number:");
		int num2 =scan.nextInt();
		int result=num1/num2;
		System.out.println("Division result:" + result);
		}
		catch(ArithmeticException e){
			System.out.println("Please do not divise by 0"+ e);
			
			}catch(InputMismatchException e) {
				System.out.println("Please enter integers"+ e);
				
			}catch(Exception e) {
				System.out.println("Please enter valid input"+ e);
			}
			scan.close();

	}

}

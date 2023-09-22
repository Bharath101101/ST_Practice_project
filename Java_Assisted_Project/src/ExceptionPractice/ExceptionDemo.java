package ExceptionPractice;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;
		int j=0;
		try {
			System.out.println("result"+i/j);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm in finally Block");
		}
			System.out.println("Result for addition"+(i+j));
			System.out.println("Result for Subtraction"+(i-j));
			System.out.println("Result for multiplication"+i*j);


	}

}

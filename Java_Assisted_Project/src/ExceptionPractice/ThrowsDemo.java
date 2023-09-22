package ExceptionPractice;

public class ThrowsDemo {
	public void div(int a ,int b) throws ArithmeticException{
		
		if(b==0) 
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo obj=new ThrowsDemo();
		try {
		obj.div(12, 2);
		}catch(Exception e) {
			System.out.println("Further code execution");
		}
		


	}

}

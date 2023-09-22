package ExceptionPractice;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;
		int j=0;
		try {
		System.out.println("result"+i/j);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}finally {
		System.out.println("Result for addition"+ (i+j));
		System.out.println("Result for Subtraction"+(i-j));
		System.out.println("Result for multiplication"+i*j);
		}


	}

}

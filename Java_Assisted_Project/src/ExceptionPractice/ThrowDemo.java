package ExceptionPractice;

	public class ThrowDemo {
		public void div(int a ,int b) {
			if(b==0) {
				throw new ArithmeticException();
			}else {
				int c=a/b;
				System.out.println(c);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo obj =new ThrowDemo();
		obj.div(12, 0);
		

	}

}

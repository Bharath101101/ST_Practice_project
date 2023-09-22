package JavaPrograms;

public class ConstructorsDemo {
	public ConstructorsDemo(){
		System.out.println("The Default Constructor");
	}
	public ConstructorsDemo(int a){
		System.out.println("This is parameterized Constructor"+a);

	}
	public ConstructorsDemo(int a,int b){
		System.out.println("This is parameterized Constructor");
		System.out.println("The value of parameter:"+ a);
		System.out.println("The value of parameter:"+ b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsDemo obj =new ConstructorsDemo();
		ConstructorsDemo obj1 =new ConstructorsDemo(10);
		ConstructorsDemo obj2 =new ConstructorsDemo(10,20);

	}

}

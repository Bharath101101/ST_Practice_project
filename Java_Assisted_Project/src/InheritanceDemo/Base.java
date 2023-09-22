package InheritanceDemo;

public class Base {
	//Public AccessModifier
		int hours=10;
		int min=20;
		//Private AccessModifier
		private int a=20;
		private int b=40;
		
	public void  openBrowser(String browser) {
		System.out.println("open the browser"+browser);
	}
	public static void  login(String username,String password ) {
		System.out.println("Enter Username: "+username);
		System.out.println("Enter Password: "+password);
		System.out.println("Sign in\n");
	}
	public void logout() {
		System.out.println("\nClick on logout Button");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

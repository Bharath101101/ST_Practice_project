package InheritanceDemo;

public class Base {
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

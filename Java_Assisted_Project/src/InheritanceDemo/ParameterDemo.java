package InheritanceDemo;

public class ParameterDemo {	
	public void login(String username,String password) {
		System.out.println("Enter Username: "+username);
		System.out.println("Enter Password: "+password);
		System.out.println("Sign in\n");
	
	
}
public void composeEmail(String text) {
	System.out.println("\nCompose an email: "+text);
}
public void logout() {
	System.out.println("\nClick on logout Button");
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ParameterDemo obj=new ParameterDemo();
	obj.login("bharath","123@admin");
	obj.composeEmail("HelloAll");
	obj.login("Zoro","432@admin");
	obj.logout();
	}

}

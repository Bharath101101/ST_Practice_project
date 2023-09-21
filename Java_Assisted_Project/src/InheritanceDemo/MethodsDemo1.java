package InheritanceDemo;

public class MethodsDemo1 {
	public void login() {
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign in\n");
		
		
	}
	public void composeEmail() {
		System.out.println("Compose an email\n");
	}
	public void logout() {
		System.out.println("Click on logout Button");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo1 obj=new MethodsDemo1();
		obj.login();
		obj.composeEmail();
		obj.logout();
		
	}

}

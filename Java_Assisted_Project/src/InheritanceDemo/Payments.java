package InheritanceDemo;

public class Payments extends HomePage{
	public void payments() {
		System.out.println("test page payments");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj=new Payments();
		obj.openBrowser("Chrome");
		login("Admin","123@Admin");
		obj.Homepagetest();
		obj.payments();
		obj.logout();
		
		

	}

}
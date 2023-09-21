package InheritanceDemo;

public class HomePage extends Base {
	public void Homepagetest() {
		System.out.println("Test for Homepage");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage obj =new HomePage();
		obj.openBrowser("chrome");
		login("Bharath","123@admin");
		obj.Homepagetest();
		obj.logout();
	}

}

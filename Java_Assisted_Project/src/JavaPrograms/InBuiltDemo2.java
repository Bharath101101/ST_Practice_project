package JavaPrograms;

public class InBuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Simplilearn online course";
		if(s1.contains("Simplilearn")) {
			System.out.println("Test case passed");
			
		}
		else {
			System.out.println("Test case failed");
			
		}
		if(s1.equals("Simplilearn online course")) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not equal");
			
		}
		String s2="Practice lab Java";
		String s3=s2.substring(13);
		System.out.println(s3);
		if(s3.equals("Java")) {
			System.out.println("Test case passed");
			
			}
		else
		{
			System.out.println("Test case failed");
			
		}
	}

}
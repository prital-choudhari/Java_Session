
public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
			
		try {
			int z = a/b;
			System.out.println(z);
		}
		
		catch (ArithmeticException e) {
			System.out.println("This is arithmatic exception");
			
		}
		finally {
			System.out.println("test");
		}
		
	}
}


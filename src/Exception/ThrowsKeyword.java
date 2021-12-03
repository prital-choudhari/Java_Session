package Exception;

public class ThrowsKeyword {

	int a = 10;
	int b = 0;

	public void m1() {
		m2();
	}

	public void m2() {
		m3();
		System.out.println("Hi");

	}

	public void m3() throws ArithmeticException {

		try {
			int z = a / b;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("Exception");
		}

	}

	public static void main(String[] args) {

		ThrowsKeyword te = new ThrowsKeyword();
		te.m2();
		System.out.println("Bye");
		
		try {
			throw new Exception("NODATA");
		} catch (Exception e) {
			System.out.println("Data missing");
		}
		
	}

}

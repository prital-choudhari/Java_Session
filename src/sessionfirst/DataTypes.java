package sessionfirst;

public class DataTypes {

	public static void main(String[] args) {
		//Integral
		//1. 1Byte = 8 bit (Range = -128 To 127)
		byte a = -100;
		byte b = 20;
		System.out.println(a+b);
		
		//2. double = 8 byte
		double a1 = 10;
		double a2 = 10.102356125;
		System.out.println(a1+a2);
			
		//3. short = 2 byte
		short s=10000;
		short s1=10;
		System.out.println(s+s1);
		
		//4. long = 8 byte
		long l=1;
		long l1=500000;
		System.out.println(l+l1);
		
		//5. float = 4 byte
		float m=10.789f;
		float m1=(float) 10.789789;
		System.out.println(m+m1);
		
		//6. int = 4 byte
		int e=5;
		int e1=50;
		System.out.println(e+e1);
		
		
		//boolean = Approx 1 bit
		boolean k = true;
		System.out.println(k);
		
		//char = 2 byte
		char c='A';
		char h='a';
		char o='1';
		h++;
		System.out.println(h);
				
	}

}

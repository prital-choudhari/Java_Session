package WrapperClass;

public class StringConversion {

	public static void main(String[] args) {
		String n = "100";
		int a = Integer.parseInt(n);
		
		System.out.println(a+20);
		
		
		
		String m = "20.22";
		double d = Double.parseDouble(m);
		System.out.println(d+30);
		
		
		String z= "100A";
		String h = z.substring(0, 3);
		System.out.println(h);
	}

}

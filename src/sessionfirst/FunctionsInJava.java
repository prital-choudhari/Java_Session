package sessionfirst;

public class FunctionsInJava {

	//1. no input no return
	public void fun() {//0 input parameter which don't have retrun keyword means this function is void in nature
		System.out.println("This is fun method");
	}

	//2. no input and some return
	
	public String myName() {
		System.out.println("What is name");
		String name="Prital";
		return name;
	
	}
	
	public int addition() {
		System.out.println("Addition is");
		int a = 100, b = 10, c;
		c=a+b;
		return c;
	}
	
	//3. some input and some return
	
	public int multiply(int a,int b) {
		System.out.println("Multiplication is");
		int c = a*b;
		return c;
	}
	
	//WAF - pass student name(String)
	//retrun marks(int);
	
	public int gettmarks(String name) {
		System.out.println("Getting Student marks for " + name);
		
//		if(name.equals("Prital")) {
//			return 90;
//		}else if (name.equals("Roo")) {
//			return 95;
//		}else {
//			System.out.println("Not Found");
//			return -1;
//		}
		
		//OR
		
		int marks = -1;
		if(name.equals("Prital")) {
			marks = 90;
		}else if (name.equals("Roo")) {
			marks = 95;
		}else {
			System.out.println("Not Found");
			marks = -1;
		}
		return marks;
		
	}
	
	
	//WAF - Pass browser name(String)
	//retrun the same browser with msg "Browser launced" using switch case
	
	public String browserName(String browser) {
		System.out.println("Current browser is "+browser);
		
		switch (browser) {
		case "Chrome":
			return browser + "  laounced";

		case "IE":
			return browser + "   laounced";

		case "Safari":
			return browser + "  laounced";

		}
		
		return null;
	}
	
	
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		obj.fun();
		String op = obj.myName();
		System.out.println(op);
		//System.out.println(obj.myName());
		System.out.println(obj.addition());
		System.out.println(obj.multiply(10, 2));
		System.out.println(obj.multiply(50, 2));
		
		int m =obj.gettmarks("Prital");
		System.out.println(m);
		
		
		String b = obj.browserName("IE");
		System.out.println(b);
	}

}

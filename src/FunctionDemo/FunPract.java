package FunctionDemo;

public class FunPract {

	// 1. No input no return
	public void name() {
		
		System.out.println("This is No input no return method");
	}
	
	//2. No input but retrun something
	
	public String getName() {
		System.out.println("This is No input but retrun something method");
		String name = "Prital";
		return name;
	}
	
	
	// 3. Some input and some retrun
	
	public int add(int a, int b) {
		System.out.println("This is addition method");
		int z = a+b;
		return z;
	}
	
	
	
	//Example
	
	public int getMarks(String name) {
		System.out.println("Calculating Student Marks");
		
		if(name.equals("Peter")) {
			return 90;
		}
		else if (name.equals("Nancy")) {
			return 100;
		}
		else{
			System.out.println("This student " + name + " not found");
			return -1;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		FunPract fp = new FunPract();
		fp.name();
		
		System.out.println(fp.getName());
//		String a = fp.getName();
//		System.out.println(a);
		
		System.out.println(fp.add(10, 20));
		
		
		int m = fp.getMarks("Prital");
		if(m==-1) {
			System.out.println("This student is not in our school");
		}
	}

}

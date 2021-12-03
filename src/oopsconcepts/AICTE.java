package oopsconcepts;

public class AICTE extends MainUni{
	
	public AICTE() {
		System.out.println("This is AICTE constructor");
	}
	
	private void pmethod() {
		System.out.println("This is my private method");
	}

	public void aictename() {
		System.out.println("This is All India Council for Technical Education");
	}
	
	//final method can not be overriden : 
	//1. Prevent method overriding
	//2. If class is declared as final then we can not inherit that class to prevent inheritance
	//3. final variables are contant we can not change
	
//	public final void location() {
//		System.out.println("This is  AICTE University location");
//	}
	
	public void location() {
		System.out.println("This is  AICTE University location");
	}
	
	//method hiding which is only applied to static method
	public static void department() {
		System.out.println("This is AICTE department");
	}
	
	@Override
	public void univercityLocation() {
		System.out.println("This is AICTE new university location");
	}
}

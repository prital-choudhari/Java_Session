package oopsconcepts;

public class Univercities extends AICTE{
	
	public void PuneUniversity() {
		System.out.println("This is Pune University");
	}

	@Override
	public void location() {
		System.out.println("This is University Pune location");
	}
	
	public void MumbaiUniversity() {
		System.out.println("This is Mumbai University");
	}

	public void MnLocation() {
		System.out.println("University location is Mumbai");
	}
	
	
	// We can not override static method
	public static void department() {
		System.out.println("This is university department");
	}
	
	public void univercityLocation() {
		System.out.println("This is updated university location");
	}
	
	//Private methods can not be overriden
//	@Override 
//	private void pmethod() {
//		System.out.println("This is my private method");
//	}
	
}

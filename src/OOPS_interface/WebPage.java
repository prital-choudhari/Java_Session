package OOPS_interface;

public interface WebPage extends W3C {
	
	//interface variables are static and final in nature
	int i=10;
	
	//In interface no method body
	//interface itself is abstract and it has no method body
	// method prototype : we can only declare
	// can not create the object of interface
	
	public void Links();
	public void Paragraphs();
	public void dropdown();
	
	
	//After jdk1.8
	//1. can have method body with static method
	
	public static void footer() {
		System.out.println("WebPage -- footer");
	}
	
	//2. Default method only define for interface
	
	default void getData() {
		System.out.println("WebPage -- page data");
	}

}

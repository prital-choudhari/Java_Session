package sessionfirst;

public class StaticVerAndFun {

	String name;
	int age;
	
	public void person() {
		System.out.println("Pesron method");
	}
	
	public static void personDetails() {
		System.out.println("Pesron details method");
	}
	public static void main(String args[]) {
		StaticVerAndFun s = new StaticVerAndFun();
		s.person();
		StaticVerAndFun.personDetails();
	}
}

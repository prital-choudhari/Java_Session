package sessionfirst;

public class MedthodOverloading {

	public void car() {
		System.out.println("This is 0 param method");
	}
	
	public void car(String name, String date) {
		System.out.println("This menthod having parameters:" +name+"," +date);
	}
	
	public static void main(String[] args) {
		MedthodOverloading m = new MedthodOverloading();
		m.car();
		m.car("Ford", "01/02/2020");

	}


}

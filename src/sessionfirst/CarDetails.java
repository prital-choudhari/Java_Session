package sessionfirst;

public class CarDetails {

	public static void main(String[] args) {
		Car c1=new Car("Baleno", "Hatchback");
		System.out.println(c1.name);
		System.out.println(c1.type);
		c1.setwheels("2 wheels");
		c1.book();
		System.out.println(c1.getwheels());
	}

}

package sessionfirst;

public class Car {

	String name;
	String type;
	int quantity;
	private String wheels;
	
	public void book() {
		System.out.println("Car is booked with: " +name +","+type+","+"2 wheels");
	}
	public Car(String name, String type) {
		this.name=name;
		this.type=type;
	}
	
	
	public void setwheels(String wheels) {
		this.wheels=wheels;
	}
	
	public String getwheels() {
		return wheels;
	}
	
}

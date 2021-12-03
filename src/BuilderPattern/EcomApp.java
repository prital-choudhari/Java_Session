package BuilderPattern;

public class EcomApp {
	
	public EcomApp login(String un, String pwd) {
		System.out.println("Login with " + un + "," + pwd);
		return this;
	}

	public EcomApp search (String prodName) {
		System.out.println("Searching with : "+prodName);
		return this;
	}
	
	public EcomApp doPayment(String cardName, String no) {
		System.out.println("Card details : " + cardName + "," +no);
		return this;
	}
	
	public EcomApp logout() {
		System.out.println("Logout from application");
		return this;
	}
}

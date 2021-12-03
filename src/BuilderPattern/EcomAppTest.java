package BuilderPattern;

public class EcomAppTest {

	public static void main(String[] args) {
		EcomApp ecom = new EcomApp();
		ecom.login("prital@gmail.com", "123")
				.search("Tshirt")
					.doPayment("Prital Choudhari", "123-46-789")
						.logout();
	}

}

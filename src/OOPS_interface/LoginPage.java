package OOPS_interface;

public class LoginPage extends PageDesign implements WebPage,MobilePage{
	
	public void login() {
		System.out.println("LoginPage -- login method");
	}
	
	public void logout() {
		System.out.println("LoginPage -- logout method");
	}

	@Override
	public void pixels() {
		System.out.println("LoginPage -- pixels method");
		
	}

	@Override
	public void SplashScreen() {
		System.out.println("LoginPage -- SplashScreen method");
		
	}

	@Override
	public void AppStore() {
		System.out.println("LoginPage -- AppStore method");
		
	}

	@Override
	public void Links() {
		System.out.println("LoginPage -- Links method");
		
	}

	@Override
	public void Paragraphs() {
		System.out.println("LoginPage -- Paragraphs method");
		
	}

	@Override
	public void dropdown() {
		System.out.println("LoginPage -- dropdown method");
		
	}

	public static void footer() {
		System.out.println("LoginPage -- footer");
	}
	
	@Override
	public void getData() {
		System.out.println("LoginPage -- page data");
	}

	@Override
	public void HTML() {
		System.out.println("LoginPage -- HTML");
		
	}

	@Override
	public void CSS() {
		System.out.println("LoginPage -- CSS");

		
	}


}

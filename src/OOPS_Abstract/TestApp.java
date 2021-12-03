package OOPS_Abstract;

public class TestApp {

	public static void main(String[] args) {
		Ios i = new Ios("Test");
		i.AppLogo();
		i.AppName("Dell");
		i.AppHeader();
		i.AppFooter();
		i.AppStroe(20);
		i.AppURL();
		
		
		System.out.println("-----------------");
		
		
		//Top casting
		AppDesign ap = new Ios();
		ap.AppLogo();
		ap.AppName("App");
		ap.AppHeader();
		ap.AppFooter();
		ap.AppURL();
		
		//Down casting : NA
		
	}

}

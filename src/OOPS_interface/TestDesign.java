package OOPS_interface;

public class TestDesign {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.AppStore();
		lp.CSS();
		lp.dropdown();
		lp.login();
		
		HomePage hp = new HomePage();
		hp.HTML();
		hp.SplashScreen();
		
		//top casting : child class object can be reffered by parent interface ref variable
		WebPage wp = new LoginPage();
		wp.dropdown();
		wp.Links();
		wp.Paragraphs();
		
		//down casting at compile time it self is not allowed as we can not create object of interface
		
		WebPage.footer();
		hp.getData();
		LoginPage.footer();
		lp.getData();
		System.out.println(LoginPage.i);
		lp.PageColor();
		lp.PageLayout();
		lp.PageLogo();
	}

}

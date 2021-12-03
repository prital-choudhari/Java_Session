package OOPS_interface;

public class HomePage extends PageDesign implements WebPage,MobilePage{
	
	public void MainMenu() {
		System.out.println("HomePage -- MainMenu method");
	}
	
	public void SubMenu() {
		System.out.println("HomePage -- SubMenu method");
	}

	@Override
	public void pixels() {
		System.out.println("HomePage -- pixels method");
		
	}

	@Override
	public void SplashScreen() {
		System.out.println("HomePage -- SplashScreen method");
		
	}

	@Override
	public void AppStore() {
		System.out.println("HomePage -- AppStore method");

		
	}

	@Override
	public void Links() {
		System.out.println("HomePage -- Links method");
		
	}

	@Override
	public void Paragraphs() {
		System.out.println("HomePage -- Paragraphs method");
		
	}

	@Override
	public void dropdown() {
		System.out.println("HomePage -- dropdown method");
		
	}

	@Override
	public void HTML() {
		System.out.println("HomePage -- HTML");		
	}

	@Override
	public void CSS() {
		System.out.println("HomePage -- CSS");			
	}

}

package OOPS_Abstract;

public class Web extends AppDesign{

	@Override
	public void AppLogo() {
		System.out.println("Web - Logo");

	}

	@Override
	public void AppName(String name) {
		System.out.println("Web - Name");

	}
	
	@Override
	public void AppHeader() {
		System.out.println("web - appheader");
	}
	

	public void WebStroe(String webname) {
		System.out.println("Web - WebStroe" +webname);
	}
	
	
}

package OOPS_Abstract;

public class Ios extends AppDesign{
	
	public Ios() {
		System.out.println("Default constructor");
	}
	
	public Ios(String cname) {
		System.out.println("1 param const : "+ cname);
	}

	@Override
	public void AppLogo() {
		System.out.println("Ios - Logo");
	}

	@Override
	public void AppName(String name) {
		System.out.println("Ios - AppName");

	}
	
	public void AppStroe(int time) {
		System.out.println("Ios - AppStroe :" +time);
	}

}

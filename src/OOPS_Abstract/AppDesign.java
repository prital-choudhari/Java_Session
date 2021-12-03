package OOPS_Abstract;

public abstract class AppDesign {

	// In abstract class we can have abstract method and non abstract method
	// Can not create object of abstract class
	// Can create constructor of abstract class and it will be called when you create object of child class

	
	// it is allowed to have 0 abstract methods - 0 % abstraction
	//it is allowed to have 0 non abstract methos - 100 % abstraction (interfaces are always 100 % abstraction)
	//it is allowed to have some abstract and some non static - partial abstraction
	public AppDesign() {
		System.out.println("Default constructor");
	}

	public AppDesign(String cname) {
		System.out.println("1 param const : "+ cname);
	}

	public abstract void AppLogo();

	public abstract void AppName(String name);

	public void AppURL() {
		System.out.println("AppDesign - App URL");
	}

	public void AppHeader() {
		System.out.println("AppDesign - App Header");
	}

	public final void AppFooter() {
		System.out.println("AppFooter - App Footer");
	}
}

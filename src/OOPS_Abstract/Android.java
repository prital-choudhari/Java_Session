package OOPS_Abstract;

public class Android extends AppDesign{

	@Override
	public void AppLogo() {
		System.out.println("Android - Logo");

	}

	@Override
	public void AppName(String name) {
		System.out.println("Android - Name");

	}

	public void PlayStroe(String app) {
		System.out.println("Android - PlayStore" +app);
	}
}

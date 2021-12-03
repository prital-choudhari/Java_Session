package prctice;

public class StringRev {
	
	
	public static void main(String[] args) {
		String a="Prital";
		char[] b=a.toCharArray();
	
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(b[i]);
		}

	}

}

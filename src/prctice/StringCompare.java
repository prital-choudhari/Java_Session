package prctice;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {
		String a = "prital";
		String b = "prgghtal";
		
		char[] a1 = a.toCharArray();
		char [] b1 = b.toCharArray();
		
//		Arrays.sort(a1);
//		Arrays.sort(b1);
		
		if(Arrays.equals(a1,b1)) {
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}

	}

}

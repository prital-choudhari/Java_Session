package sessionfirst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {
		// ArrayList --> class
		
//		ArrayList ar = new ArrayList();
//		ar.add(10);
//		ar.add("e");
//		ar.add(5);
//		ar.add(6);
//		ar.add(7);
//		System.out.println(ar.size());
//		ar.remove(2);
//		System.out.println(ar);
		
//		ArrayList <Integer> roll_No = new ArrayList<Integer>();
//		roll_No.add(1);
//		roll_No.add(15);
//		roll_No.add(3);
//		roll_No.add(16);
//		roll_No.add(2);
//		roll_No.add(7);
//		
//		for(int i=roll_No.size()-1;i>=0;i--) {
//			System.out.println(roll_No.get(i));
//		}
//		Collections.sort(roll_No);
//		System.out.println(roll_No);
		
		
		ArrayList<Character> ch = new ArrayList<Character>();
		ch.add('R');
		ch.add('O');
		ch.add('H');
		ch.add('I');
		ch.add('T');
		
		for(int i = ch.size()-1;i>=0;i--) {
			System.out.println(ch.get(i));
		}
		Collections.sort(ch);
		System.out.println(ch);
	}

}

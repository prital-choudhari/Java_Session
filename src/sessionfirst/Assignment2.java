package sessionfirst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		
		//Q1. Print the pattern
		for (int i=0;i<=3;i++) {
			for (int j=0;j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		//Q2. Question 2: Write a program to create a static Array, having following cricket data:
		//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
		//--Try to create multiple Object Arrays for different players 
		//--Try to print all the values of each player on the console using normal for/while loop and for each loop
		
		Object ob[] = new Object[7];
		ob[0]="cricker 1";
		ob[1]=30;
		ob[2]="Ind";
		ob[3]="01/02/2021";
		ob[4]='M';
		ob[5]=20;
		ob[6]=false;
		
		
		Object ob1[] = new Object[7];
		ob1[0]="cricker 2";
		ob1[1]=35;
		ob1[2]="Eng";
		ob1[3]="01/02/2022";
		ob1[4]='M';
		ob1[5]=25;
		ob1[6]=false;

		Object ob2[] = new Object[7];
		ob2[0]="cricker 3";
		ob2[1]=40;
		ob2[2]="Aus";
		ob2[3]="01/02/2023";
		ob2[4]='M';
		ob2[5]=30;
		ob2[6]=false;
		
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		System.out.println("-------------------");
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob1[i]);
		}
		System.out.println("-------------------");
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob2[i]);
		}
		
		System.out.println("--------------------------------");
		//Q3: Try to print the following pattern on the console:
		//n = 4
		//n = 3
		//n = 2
		//n = 1
		//n = 0
		for(int i=4;i>=0;i--) {
			System.out.println("n="+i);
		}
		
		System.out.println("--------------------------------");
		//Q4. Write a Java program to create a new array list, add some colors (string) and print out the collection
		//Q5. Write a Java program to insert an element into the array list at the first and last positions.
		
		
		ArrayList<String> colr =new ArrayList<String>(10);
		
		colr.add("Yellow");
		colr.add("Blue");
		colr.add("Pink");
		colr.add("Violet");
		System.out.println(colr.size());
		System.out.println(colr);
		System.out.println("--------------------------------");
		//Q6. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(colr.get(2));
		
		System.out.println("--------------------------------");
		//Q7. Write a Java program to update specific array element by given element.
		colr.set(2,"Green");
		System.out.println(colr);

		System.out.println("--------------------------------");
		//Q8. Write a Java program to remove the third element from a array list. 
		colr.remove(2);
		System.out.println(colr);
		
		System.out.println("--------------------------------");
		//Q9. Write a Java program to search an element in a array list.
		boolean search = colr.contains("SkyBlue");
		if(search) {
			System.out.println("Element exist");
		}else {
			System.out.println("Element not exist");
		}
		
		System.out.println("--------------------------------");
		//Q10. Write a Java program to reverse elements in a array list
		for(int i=colr.size()-1;i>=0;i--) {
			System.out.println(colr.get(i));
		}
		
		System.out.println("--------------extract------------------");
		//Q11. Write a Java program to extract a portion of a array list.
		List<String> extract = colr.subList(0, 2);
		System.out.println(extract);
		
		
		System.out.println("----------------Swap----------------");
		//Q12. Write a Java program of swap two elements in an array list.
		Collections.swap(colr, 0, 1);
		System.out.println(colr);
		
		System.out.println("--------------------------------");
		//Q13. Write a Java program to empty an array list.
		colr.removeAll(colr);
		System.out.println(colr);
		
		System.out.println("---------------virtual capacity-----------------");
		//Q14. Write a Java program to trim the virtual capacity of an array list the current list size.
		colr.trimToSize();
		System.out.println(colr);
		System.out.println("--------------------------------");
		//Q15. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		for(int i=0;i<colr.size();i++) {
			System.out.println(i+": "+colr.get(i));
		}
	}

}

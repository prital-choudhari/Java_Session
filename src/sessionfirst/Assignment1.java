package sessionfirst;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("*Loops Assignment Below*");
		System.out.println("-------------------");
		// Loops Assignment:
		// Q1.I am Batman
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("-------------------");

		// Q2.I am Batman1,2,3...
		for (int j = 1; j <= 9; j++) {
			System.out.println("I am Batman" + j);
		}
		System.out.println("-------------------");

		// Q3.Print 10 to 1 using for, while and do-while loop
		// For loop
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}
		System.out.println("-------------------");
		// While loop
		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l--;
		}
		System.out.println("-------------------");
		// Do-While loop
		int m = 10;
		do {
			System.out.println(m);
			m--;
		} while (m >= 1);
		System.out.println("-------------------");
		// Q4.Print "Hello World" 10 times using while loop

		int n = 1;
		while (n <= 10) {
			System.out.println("Hello World");
			n++;
		}
		System.out.println("-------------------");

		// Q5. Print 1 to 10 using while loop but quit if multiple of 7 is encountered

		int p = 1;
		while (p <= 10) {
			System.out.println(p);
			p++;
			if (p % 7 == 0) {
				break;
			}
		}
		System.out.println("-------------------");
		System.out.println("*Data Types Assignments Below*");
		System.out.println("-------------------");
		// Data Types Assignments
		// Q1. Print 'Hello' on screen and then print your name on a separate line
		String s = "Hello";
		System.out.println(s);
		System.out.println("Prital C");

		System.out.println("-------------------");
		// Q2. Print the sum of two numbers
		int b = 74;
		int c = 36;
		int sum = b + c;
		System.out.println("Sum is: " + sum);

		System.out.println("-------------------");
		// Q3. Divide two numbers and print on the screens
		int d1 = 50;
		int d2 = 3;
		int div = d1 / d2;
		System.out.println("Division is: " + div);

		System.out.println("-------------------");
		// Q4. Print the result of the following operations. Change your test data
		// accordingly.
		// Test Data:
		// a. -5 + 8 * 6
		// b. (55+9) % 9
		// c. 20 + -3*5 / 8
		// d. 5 + 15 / 3 * 2 - 8 % 3

		int a1, a2, a3, a4;
		a1 = -5 + 8 * 6;
		a2 = (55 + 9) % 9;
		a3 = 20 + -3 * 5 / 8;
		a4 = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("-------------------");
		// Q5. Program to compute the specified expressions and print the output.((25.5
		// * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

		double l1;
		l1 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(l1);
		System.out.println("-------------------");

		// Q6. Try to concat "Hello Selenium" with a character 't'
		System.out.println("Hello Selenium" + "t");
		System.out.println("-------------------");

		// Q7. Create three int variables having values like : 100, 200, 3400. Add them
		// and concatenate and generate this output String Your Total amount is. 3700
		int q1 = 100;
		int q2 = 200;
		int q3 = 3400;
		System.out.println("Your Toal amount is." + (q1 + q2 + q3));
		System.out.println("-------------------");

		// Q8. Output for byte b3 = 065
		byte b3 = 065;
		System.out.println(b3);

		System.out.println("-------------------");
		System.out.println("*Conditonal Operators Assignments Below*");
		System.out.println("-------------------");

		// Q1. Print the greatest number from three numbers
		int n1 = 25;
		int n2 = 78;
		int n3 = 87;

		if (n1 > n2 && n1 > n3) {
			System.out.println("The gretest:" + n1);
		} else if (n2 > n3) {
			System.out.println("The gretest:" + n2);
		} else {
			System.out.println("The gretest:" + n3);
		}

		System.out.println("-------------------");
		// Q2. Program to test a number is positive or negative

		int r1 = 35;
		int r2 = -11;

		if (r1 >= 0) {
			System.out.println("Number is positive: " + r1);
		}
		if (r2 <= 0) {
			System.out.println("Number is negative: " + r2);
		}
		System.out.println("-------------------");

		int h1=1000;
		int h2=2000;
		int h3=3000;
		
		System.out.println(h1*10/100);
		System.out.println(h2*20/100);
		System.out.println(h3*35/100);
	}

}

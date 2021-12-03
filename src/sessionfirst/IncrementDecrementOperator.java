package sessionfirst;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int a1 = 2;
		int a2 = 3;
		System.out.println(++a1 + a1-- + a2++);
		
		//++a1 = 3, a1-- = 3 (After execution value will become 2), a2++ = 3 (After execution value will become 4) output = 9 (3+3+3)
		
		int a = 10;
		int b = 20;
		int c = ++a + ++b; //(11+21=32)
		int e = c--;
		System.out.println(e);
		
		System.out.println(0/9); //o/p = 0
		//System.out.println(9/0); //o/p = Exception
		System.out.println(10.15/20.36f);
		System.out.println(9/0.0); //o/p = Infinity
		//System.out.println(0/0);//o/p = Exception
		System.out.println(0.0/0.0);//o/p = NaN
		
		int h = c++ + ++e * b / a;
		System.out.println(h);
		
		int v=2;
		System.out.println(+v);
	}

}

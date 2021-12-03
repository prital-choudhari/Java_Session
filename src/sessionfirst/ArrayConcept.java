package sessionfirst;

public class ArrayConcept {

	public static void main(String[] args) {
		Object ob[] = new Object[3];
		ob[0]=10;
		ob[1]="Prital";
		ob[2] = 'F';
		
		for(int i=0;i<ob.length;i++) {
			System.out.println(i + ":" + ob[i]);
		}
		
		//for each
//		int j=0;
//		for(Object e : ob) {
//			System.out.println(j++ + ":" + e);
//		}

	}

}

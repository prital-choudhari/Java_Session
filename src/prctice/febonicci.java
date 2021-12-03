package prctice;

public class febonicci {

	public static void main(String[] args) {
		//num = 0,1,2,3,4
		
		int temp;
		int t1 = 0;
		int t2 = 1;
		
		for (int i=0; i<=10;i++) {
			temp = t1+t2;
			t1=t2;
			t2=temp;
			
			System.out.println(temp);
		}

	}

}

package prctice;

public class StarPattern1 {

	public static void main(String[] args) {
		
		//right triangle
		
		for(int i=1; i<3;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//right pasckel triangle
		for(int i=1; i<=3;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2; i>=0;i--) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

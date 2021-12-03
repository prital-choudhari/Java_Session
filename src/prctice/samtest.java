package prctice;

public class samtest {

	public static void main(String[] args) {
		int n = 10;
	    for(n=0;n<=10;n++){
	    	System.out.println(n);
	        if(n%3==0 && n%5==0){
	            System.out.println("Fizz");
	        }
	        else if(n%5==0 && n%10==0){
	            System.out.println("Buzz");
	        }
	    }

	}

}

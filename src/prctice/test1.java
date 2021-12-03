package prctice;

public class test1 {

	public static void main(String[] args) {
		 {
			 int[] A = {4,5,1,2,3,1,4,2,3};
		        int target = 4;
		        findPair(A, target);
		    }
	}
		 
		 public static void findPair(int A[], int target)
		    {
		        // consider each element except the last
		        for (int i = 0; i < A.length - 1; i++)
		        {
		            // start from the i'th element until the last element
		            for (int j = i + 1; j < A.length; j++)
		            {
		                
		                if (A[i] + A[j] == target)
		                {
		                    System.out.println("Pair found (" + A[i] + ", " + A[j] + ")");
		                    return;
		                }
		            }
		        }
		        System.out.println("Pair not found");
}
}

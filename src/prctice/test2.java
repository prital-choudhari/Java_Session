package prctice;

public class test2 {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int element = 2;
        int index = -1;
        int count[] = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
                count[index] += 1;
                break;
            }
        }
         
        System.out.println("Index of "+element+" is : "+index);
    }
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		
}

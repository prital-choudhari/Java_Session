package prctice;

import java.util.ArrayList;

public class test3 {

	public static int findIndex(int arr[], int t)
    {
        ArrayList<Integer> clist = new ArrayList<>();

        for (int i : arr)
            clist.add(i);
        return clist.indexOf(t);
    }

	public static void main(String[] args) {
		int[] my_array = {4,5,1,2,3,1,4,2,3};

		// find the index of 5
		System.out.println("Index position of 1 is: " + findIndex(my_array, 1));
	}

}

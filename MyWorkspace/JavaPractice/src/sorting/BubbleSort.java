package sorting;

import java.util.Arrays;

/**
 * In this sorting algorithm we iterate n-1 times and in each iteration we find the maximum value between
 * current element and its adjacent element and move it to right.
 * Time Complexity: O(n^2)
 * Best case: O(n)
 * Average case: O(n^2)
 *  
 * */
public class BubbleSort {

	public static void sort(int [] unsorted) {
		
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		
		int k = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			keepGoing = false;
			for (int j = 0; j < (unsorted.length - k - 1); j++) {
				if (unsorted[j] > unsorted[j + 1] ) {
					int tempVal =  unsorted[j];
					unsorted[j] = unsorted[j + 1];
					unsorted[j + 1] = tempVal;
					keepGoing = true;
				}
			}
			k++;
		}
			
		
		System.out.println("Sorted Array: " + Arrays.toString(unsorted));
	}
	
	public static void main(String a[]) {
		
		int unsortedArray[] = {4,2,5,9,7,3,6,1,8};
		BubbleSort.sort(unsortedArray);
		
	}
}

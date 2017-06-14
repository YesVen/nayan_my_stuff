package sorting;

import java.util.Arrays;

/**
 * In this sorting algorithm we iterate n-1 times and in each iteration we find the minimum value 
 * and replace it with 1th position
 * Time Complexity: O(n^2)
 *  
 * */
public class SelectionSort {

	public static void sort(int [] unsorted) {
		
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		
		for (int i = 0; i < unsorted.length - 1; i++) {
			int minVal = unsorted[i];
			int minValPos = i;
			for (int j = (i + 1); j < unsorted.length; j++) {
				if (unsorted[j] < minVal) {
					minVal = unsorted[j];
					minValPos = j;
				}
			}
			if (minValPos != i) {
				int tempVal = unsorted[i];
				unsorted[i] = unsorted[minValPos];
				unsorted[minValPos] = tempVal;
			}
		}
		
		System.out.println("Sorted Array: " + Arrays.toString(unsorted));
	}
	
	public static void main(String a[]) {
		
		int unsortedArray[] = {4,2,5,9,7,3,6,1,8};
		SelectionSort.sort(unsortedArray);
		
	}
}

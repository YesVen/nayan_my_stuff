package sorting;

import java.util.Arrays;

/**
 * In this sort we will divide array into two subset.Like 1st subster will be from 0-1 
 * and 2nd subset will from 1-N. In every iteration we will take elements from 2nd(unsorted)
 * set and place into 1st(sorted) set accordingly. 
 * Time Complexity:
 * Best case: O(n)
 * worst/Averge case: O(n^2)
 *  
 * */
public class InsertionSort {

	public static void sort(int [] unsorted) {
		
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		
		for (int i = 1; i < unsorted.length; i++) {
			int val = unsorted[i];
			int hole = i;
			while (hole > 0 && val < unsorted[hole -1]) {
				unsorted[hole] = unsorted[hole - 1];
				hole--;
			}
			unsorted[hole] = val;
		}
		System.out.println("  Sorted Array: " + Arrays.toString(unsorted));
	}
	
	public static void main(String a[]) {
		
		int unsortedArray[] = {4,2,5,9,7,3,6,1,8};
		InsertionSort.sort(unsortedArray);
		
	}
}

/*
Find Greatest number in a given array with distinct numbers in O(n) time and O(1) space
https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
*/


import java.io.*;
import java.util.Arrays;

class GFG {
    public static int[] findLargest(int[] arr, int k){
        int start = 0, end = arr.length - 1; 
        helper(arr, start, end, k); 
        int[] result = new int[k]; 
        for(int i = 0; i < k; i++) result[i] = arr[i]; 
        return result;
    }
    
    public static void helper(int[] arr, int start, int end, int k){
        if(start >= end) return;
        int pivot = partition(arr, start, end); 
        if(pivot > k - 1) helper(arr, start, pivot - 1, k); 
        else helper(arr, pivot + 1, end, k);
    }
    
    public static int partition(int[] arr, int start, int end){
        int random = end; 
        swap(arr, random, end); 
        int j = start - 1; 
        for(int i = start; i < end; i++){
            if(arr[i] > arr[end]) swap(arr, ++j, i);
        }
        swap(arr, ++j, end);
        return j;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    
	public static void main (String[] args) {
	    int[] arr = {10, 4, 3, 50, 23, 90};
	    int k = 3; 
		int[] result = findLargest(arr, k); 
		System.out.println(Arrays.toString(result));
	}
}
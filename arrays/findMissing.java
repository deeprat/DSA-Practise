/*
Find the missing number 
https://www.geeksforgeeks.org/find-the-missing-number/
*/

class GFG {
    public static int findMissingNumber(int[] arr){
       int N = arr.length + 1; 
       int xor = 0; 
       for(int i = 1; i <= N; i++) xor ^= i; 
       for(int i = 0; i < arr.length; i++) xor ^= arr[i];
       return xor;
    }
	public static void main (String[] args) {
	    int[] arr = {1, 2, 3, 4, 5, 6}; 
	    int result = findMissingNumber(arr); 
	    System.out.println(result);
	}
}
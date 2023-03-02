// find min and max in an array using least no. of comparisions

public class Solution{
    // 2*(n - 1) comparisions
    // public static int[] findMinAndMax(int[] arr){
    //     int[] result = new int[2]; 
    //     int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    //     for(int each : arr){
    //         max = Math.max(max, each); 
    //         min = Math.min(min, each);
    //     }
    //     result[0] = min; result[1] = max; 
    //     return result;
    // }

    public static int[] findMinAndMax(int[] arr){
        int start = 0, end = arr.length - 1;
        int mid = (start + end) >> 1; 
        int result = new int[2];
        int[] left = _findMinAndMax(arr, start, mid); 
        int[] right = _findMinAndMax(arr, mid + 1, end); 
        int leftMin = left[0], leftMax = left[1]; 
        int rightMin = right[0], rightMax = right[1];
        if(leftMin < rightMin) result[0] = leftMin; 
        else result[0] = rightMin; 
        if(rightMax > leftMax) result[1] = rightMax; 
        else result[1] = leftMax;
        return result;  
    }

    public static int[] _findMinAndMax(int[] arr, int start, int end){

    }

    //
    public static void main(String... args){
        int[] nums = {1, 2, 4, 5, 6, 1, 2, 3};
        System.out.println(Arrays.toString(findMinAndMax(nums)));
    }
}
// TC: O(logN)
// SC: O(1)
public class Test{
    public static int findFirstIncreasingThenDecreasing(int[] arr){
        int low = 0, high = arr.length - 1; 
        int result = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                result = arr[mid];
            }
            if(arr[mid + 1] > arr[mid]) low = mid + 1; 
            else high = mid - 1;
        }
        return result;
    }

    public static void main(String... args){
        int[] nums = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        System.out.println(findFirstIncreasingThenDecreasing(nums));
    }
}

// Recursive way 
// public class Test{
//     public static int findFirstIncreasingThenDecreasing(int[] nums, int low, int high){
//         if(low == high) return arr[high]; 
//         int mid = low + (high - low)/2; 
//         if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return arr[mid]; 
//         else if(arr[mid] < arr[mid + 1]) return findFirstIncreasingThenDecreasing(nums, mid + 1, high); 
//         else findFirstIncreasingThenDecreasing(nums, low, mid - 1); 
//     }

//     public static void main(String... args){
//         int[] nums = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
//         System.out.println(findFirstIncreasingThenDecreasing(nums, 0, nums.length - 1));   
//     }
// }
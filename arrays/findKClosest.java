import java.util.Arrays;

class Solution{
    public static int[] findKClosest(int[] arr, int x, int k){
        int[] result = new int[k]; 
        int n = arr.length;
        //Find the cross point using binary search
        int l = 0, r = n - 1; 
        int mid = (l + r) >> 1;
        while(l <= r){
            if(arr[mid] == x) break; 
            else if(arr[mid] > x) r = mid - 1;
            else l = mid + 1;
            mid = (l + r) >> 1;
        }
        // Mid now points to the elemnent around which we have to look 
        // for the closest k elements
        int i = mid - 1, j = mid + 1, index = 0;
        while(i >= 0 && j <= n - 1 && k != 0){
            int absLeft = Math.abs(x - arr[i]);
            int absRight = Math.abs(x - arr[j]);
            if(absLeft < absRight){
                result[index++] = arr[i]; 
                i--;
            } 
            else{
                result[index++] = arr[j];
                j++;
            } 
            k = k - 1;
        }

        while(i >= 0 && k != 0){
            result[index++] = arr[i]; 
            i--;
            k = k - 1;
        }

        while(j <= n - 1 && k != 0){
            result[index++] = arr[j];
            j++; 
            k = k - 1;
        }
        // Sort the array before returning
        Arrays.sort(result);
        return result;
    }
    public static void main(String... args){
        int[] nums = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53};
        int x = 35, k = 4;
        int[] result = findKClosest(nums, x, k);
        System.out.println(Arrays.toString(result));
    }
}

/*
Output: [30, 39, 42, 45]
 */
// find triplets with sum zero
// TC: O(N^2)
// SC: O(N)

import java.util.Arrays;
import java.util.List; 
import java.util.ArrayList; 
import java.util.HashSet; 
import java.util.Set;

public class Test{
    public static List<List<Integer>> findTripletsWithSumZero(int[] nums){
        List<List<Integer>> result = new ArrayList<>(); 
        Set<Integer> set = new HashSet<>();
        for(int each: nums) s.add(each); 
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue; 
                int sum = nums[i] + nums[j]; 
                int findSum = -sum; 
                if(set.contains(findSum)){
                    List<Integer> triplet = new ArrayList<>(); 
                    triplet.add(nums[i]); 
                    triplet.add(nums[j]);
                    triplet.add(-sum); 
                    result.add(triplet);
                }
            }
        }
        return result;   
    }


    public static void main(String... args){
        int[] nums = {0, -1, 2, -3, 1}; 
        List<List<Integer>> result = findTripletsWithSumZero(nums); 
        System.out.println(Arrays.toString(result));
    }
}

public class Test{
    public static List<List<Integer>> findTripletsWithSumZero(int[] nums){
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>(); 
        int low = 0, high = nums.length - 1;
        while(low < high){
            int sum = arr[low] + arr[high]; 
            int findSum = -sum; 
            //Apply binary search to find the element
            int i = 0, j = arr.length - 1; 
            while(i < j){
                int mid = i + ((j - i) >> 1);
                if(arr[mid] == findSum){
                    List<Integer> triplet = new ArrayList<>(); 
                    triplet.add(arr[low]); 
                    triplet.add(arr[high]); 
                    triplet.add(arr[mid]); 
                    result.add(triplet);
                }
                else if(arr[mid] >  findSum) high = mid - 1; 
                else low = mid + 1;
            }
            low++; high--;
        }
        return result;
    }

    public static void main(String... args){
        int[] nums = {0, -1, 2, -3, 1}; 
        List<List<Integer>> result = findTripletsWithSumZero(nums); 
        System.out.println(Arrays.toString(result));
    }
}
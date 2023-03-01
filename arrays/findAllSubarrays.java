import java.util.*; 

public class Test{
    public static List<List<Integer>> findSubarrays(int[] arr){
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        helper(arr, result, 0, curr);
        return result;
    }
    
    public static void helper(int[] arr, List<List<Integer>> result, int pos, List<Integer> curr){
        if(pos >= arr.length) return;
        curr.add(arr[pos]);
        result.add(new ArrayList<>(curr)); 
        helper(arr, result, pos + 1, curr); 
        curr.remove(curr.size() - 1);
        helper(arr, result, pos + 1, curr);
    }
    
    public static void main(String... args){
        int[] arr = {1, 2, 3};
        System.out.println(findSubarrays(arr));
    }
}
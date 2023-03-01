import java.util.Arrays;

public class Test{
    public static int[] findPairWithGivenSum(int[] arr, int val){
        int[] result = new int[2];
        Arrays.sort(arr); 
        int low = 0, high = arr.length - 1;
        while(low < high){
            int curr = arr[high] + arr[low]; 
            if(curr == val){
                result[0] = arr[high]; 
                result[1] = arr[low];
                break;
            }
            else if(curr > val) high--;
            else low ++;
        }
        return result;
    }

    public static void main(String... args){
        int[] arr = {7, 1, 8, 5, 6, 3}; 
        System.out.println(Arrays.toString(findPairWithGivenSum(arr, 7)));
    }
}
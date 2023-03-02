// https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
// Category: Medium
// Asked in Amazon

class Solution {
    int findMaximum(int[] arr, int n) {
        int l = 0, r = n - 1; 
        int mid = (l + r) >> 1;
        while(l <= r){
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) break;
            else if(mid > 0 && arr[mid - 1] > arr[mid]) r = mid - 1;
            else l = mid + 1;
            mid = (l + r) >> 1; 
        }
        return arr[mid];
        
    }
}
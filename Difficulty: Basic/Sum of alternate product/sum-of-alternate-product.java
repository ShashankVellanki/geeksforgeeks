import java.util.*;
class Solution {
    public int altProduct(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n/2;i++){
            sum+=arr[i]*arr[n-i-1];
            
        }
        return sum;
    }
}
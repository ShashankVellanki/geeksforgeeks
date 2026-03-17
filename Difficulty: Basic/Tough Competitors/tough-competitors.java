import java.util.Arrays;
class Solution {
    public int minDiff(int[] arr) {
        // code here
        int min;
        Arrays.sort(arr);
        
        min=arr[1]-arr[0];
        
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min)
                min=arr[i]-arr[i-1];
        }
        return min;
    }
}

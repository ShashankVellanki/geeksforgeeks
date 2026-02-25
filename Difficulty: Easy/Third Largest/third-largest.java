import java.util.*;
class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        return arr[n-3];
        
        
    }
}
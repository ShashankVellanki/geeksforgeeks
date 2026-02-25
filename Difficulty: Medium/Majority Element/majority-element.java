import java.util.*;

class Solution {
    int majorityElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
        int count=1;
        if(n==1)
            return arr[0];
        
        
        for(int i =1;i<n;i++){
            if(arr[i]==arr[i-1])
                count++;
            else
                count=1;
            if(count>n/2)
                return arr[i];
        }
        return -1;
    }
}
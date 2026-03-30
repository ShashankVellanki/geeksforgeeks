import java.util.*;
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        
        ArrayList<Integer> res= new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        if(arr[0]==arr[n-1]){ res.add(-1);
        return res;}

        int min=arr[0];
        int min2=arr[1];
        int j=0;
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                j=i;
            }            
        }
        for(int i=2;i<n;i++){
            if(min2>arr[i]&&min2!=min)
                min2=arr[i];
            if(min2==min)
                min2=arr[i];
        }
        res.add(min);
        res.add(min2);
        return res;
        
    }
}

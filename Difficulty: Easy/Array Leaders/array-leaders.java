import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        int n= arr.length;
        int leader=arr[n-1];
        res.add(leader);

        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                res.add(leader);
                
            }
                
        }
        Collections.reverse(res);
        
        return res;
        
    }
}

//import java.util.*;
class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        //Arrays.sort(arr);
        
        int n=arr.length;
        int temp;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
        
    }
}
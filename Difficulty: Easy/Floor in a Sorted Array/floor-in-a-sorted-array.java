class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        if(arr[0]>x)return -1;
        if(n==1)return 0;
        for(int i=0;i<n;i++){
            
            if(arr[i]>x)
                return i-1;
        }
        return n-1;
        
    }
}

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        /*
        int n=arr.length;
        int rev[]= new int[n];
        
        for(int i =0;i<n;i++){
            rev[i]=arr[n-i-1];
        }
        for(int i =0;i<n;i++){
            arr[i]=rev[i];
        }*/
        int temp;
        int front=0;
        int last=arr.length-1;
        
        while(front<last){
            temp=arr[front];
            arr[front]=arr[last];
            arr[last]=temp;
            front++;
            last--;
        }
        
        
        
        
    }
}
class Solution {
    public String longest(String[] arr) {
        // code here
        int len;
        int maxlen=0;
        int index=0;
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            len=arr[i].length();
            if(maxlen<len){
                maxlen=len;
                index=i;
            }
        }
        
        return arr[index];
    }
}
class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        int n=arr.length;
        
        for(int i =0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                res.add(arr[i+1]);
            }
            else
                res.add(arr[i]);
        }
        return res;
        
    }
};
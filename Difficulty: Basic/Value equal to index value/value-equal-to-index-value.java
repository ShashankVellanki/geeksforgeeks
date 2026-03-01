class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n= arr.length;
        
        for(int i =0;i<n;i++){
            if(arr[i]==i+1)
                res.add(arr[i]);
        }
        return res;
    }
}

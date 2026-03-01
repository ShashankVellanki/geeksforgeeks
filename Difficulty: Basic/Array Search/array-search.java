// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        //ArrayList<Integer> arr=new ArrayList<>();
        int n=arr.size();
        int temp=0;
        for(int i =0;i<n;i++){
            temp=arr.get(i);
            if(k==temp)
                return i+1;
        }
        return -1;
    }
}
class Solution {
    public int lastDigit(int n) {
        // Code here
        if(n<0)
            n*=-1;
        
        return n%10;
    }
}
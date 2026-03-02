class Solution {
    public int reverseExponentiation(int n) {
        // code here
        
        int rev=0;
        int digit=0;
        int res=1;
        int temp =n;
        while(n>0){
            digit=n%10;
            n=n/10;
            rev=digit+(rev*10);
        }
        n=temp;
        while(rev>0){
            res=n*res;
            rev--;
        }
        return res;
    }
}

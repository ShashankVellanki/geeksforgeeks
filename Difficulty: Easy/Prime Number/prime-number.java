class Solution {
    static boolean isPrime(int n) {
        // code here
        
        if(n<=1 || n%2==0){
            return false;
        }
        
        for(int i=3;i<n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
        
        
    }
}
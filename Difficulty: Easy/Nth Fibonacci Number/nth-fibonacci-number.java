class Solution {
    public int nthFibonacci(int n) {
        // code here
        int a=0;
        int b=1;
        int sum;
        for(int i=0;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return a;
    }
}
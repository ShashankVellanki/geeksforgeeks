//import java.util.*;
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int digit;
        int sum=0;
        int temp=n;
        while(n>0){
            digit=n%10;
            n/=10;
            sum+=Math.pow(digit,3);
        }
        if(sum==temp)
            return true;
        return false;
    }
}
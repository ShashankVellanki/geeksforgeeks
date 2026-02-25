// User function Template for Java
import java.util.Arrays;
class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int n= arr.length;
        long sum = 0;
        long MOD = 1000000007;

        Arrays.sort(arr);
        
         for (int i = 0; i < n; i++) {
            sum = (sum + (long)i * arr[i]) % MOD;
        }
        
        
        return (int) sum;
        
    }
}

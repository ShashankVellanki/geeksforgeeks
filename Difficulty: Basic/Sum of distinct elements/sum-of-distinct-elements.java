import java.util.*;

class Solution {
    int findSum(int arr[]) {

        int n = arr.length;
        Arrays.sort(arr);

        long sum = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                sum += arr[i];
            }
        }

        return (int) sum;
    }
}
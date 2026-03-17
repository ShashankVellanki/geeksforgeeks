class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Index of the next non-zero element

        for (int i = 0; i < n; i++) {
            // If the current element is non-zero
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                
                
                count++;
            }
        }
    }
}
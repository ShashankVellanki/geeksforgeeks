
class Solution {

    public static int product(int arr[], int n) {
        
        long product=1;
        
        for(int i=0;i<n;i++){
            product*=arr[i];
        }
        return (int) product;
    }
}

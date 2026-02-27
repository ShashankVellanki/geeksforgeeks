// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        
        int count=0;
        
        for(int i=A;i<=B;i++){
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    count++;
                    break;
                }
            }
            
        }
        if (count==(B-A+1))
            return true;
        else 
            return false;
        
    }
}

class Solution {
    int middle(int a, int b, int c) {
        // code here
        if(a>b && a>c){
            if(b>c){
                return b;
            }
            else
                return c;
        }
        if(a<b && b>c){
            if(a>c){
                return a;
            }
            else
                return c;
        }
        if(c>b && a<c){
            if(a>b){
                return a;
            }
            else
                return b;
        }
        return -1;
    }
}
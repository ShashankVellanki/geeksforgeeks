
class Solution {
  public:
    void Learning(int a[], int n, float &pos, float &neg, float &zero) {
    int p_count = 0, n_count = 0, z_count = 0;

    
    for(int i = 0; i < n; i++) {
        if(a[i] > 0) p_count++;
        else if(a[i] < 0) n_count++;
        else z_count++;
    }

    
    pos = (float)n / p_count;
    neg = (float)n / n_count;
    zero = (float)n / z_count;
}
};
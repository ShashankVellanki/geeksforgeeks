class Solution {
    public String compressString(String s) {
        // code here
        
        s=s.toLowerCase();
        
        int count=0;
        String res="";
        for(int i=0;i<s.length();){
            char temp=s.charAt(i);
            count=0;
            res+=temp;
            while(i < s.length() && temp==s.charAt(i)){
                count++;
                i++;
            }
            
            res+=count;
        }
        
        return res;
    }
}
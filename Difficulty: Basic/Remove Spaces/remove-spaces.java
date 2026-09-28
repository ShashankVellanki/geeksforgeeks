class Solution {
    public String removeSpaces(String s) {
        // code here
        String mod="";
        int n=s.length();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' ')
                mod+=s.charAt(i);
            
        }
        return mod;
        
    }
}
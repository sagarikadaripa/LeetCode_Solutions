class Solution {
    public void reverseString(char[] s) {
       reverse(s,0);
    }
    private void reverse(char[] s,int idx){
        
        if(idx > s.length - idx - 1){
            return;
        }
        char c = s[idx];
        s[idx] = s[s.length - idx - 1];
        s[s.length - idx - 1] = c;
        reverse(s,idx+1);
    }
}
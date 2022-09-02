class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int tempNum = x;
        int rev =  0;
        while(tempNum > 0){
            int digit = tempNum % 10;
            rev = rev*10 + digit;
            tempNum/=10;
        }
        if(rev == x) return true;
        else return false;
    }
}
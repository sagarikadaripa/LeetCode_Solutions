class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int l = 0,h = s.length()-1;
        while(l <= h){
            char chStart = s.charAt(l);
            char chEnd = s.charAt(h);
            if(!Character.isLetterOrDigit(chStart))
                l++;
            else if(!Character.isLetterOrDigit(chEnd))
                h--;
            else{
                if(Character.toLowerCase(chStart) != Character.toLowerCase(chEnd))
                    return false;
                l++; h--;
            }
        }
        return true;
    }
}
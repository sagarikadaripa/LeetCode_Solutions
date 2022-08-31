class Solution {
    public int mySqrt(int n) {
        
        if(n == 1) return n;
        long l = 1, h = n - 1,ans = 0;
        while(l <= h){
            long mid = l + (h - l)/2;
            if(mid*mid == n){  
                return (int)mid;
            }
            else if(mid*mid > n){
                h = mid - 1;
            }else{
                ans = mid;
                l = mid + 1;
            }
        }
        return (int)ans;
    }
}

class Solution {
    public int findPeakElement(int[] arr) {
        int l = 0, h = arr.length - 1;
        int mid = 0;
        while(l <= h){
            mid = l + (h - l)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 ||arr[mid] > arr[mid + 1]))
                return mid;
            if(mid > 0 && arr[mid] <= arr[mid -1]) h = mid - 1;
            else l = mid + 1;
        }
        return mid;
    }
}
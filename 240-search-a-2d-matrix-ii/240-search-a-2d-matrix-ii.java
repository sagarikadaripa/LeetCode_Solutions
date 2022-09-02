class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int l = 0,h = matrix[0].length - 1;
        while(l < matrix.length && h>=0){
            if(matrix[l][h] == target) return true;
            else if(matrix[l][h] > target)
                h--;
            else
                l++;
        }
        return false;
    }
}
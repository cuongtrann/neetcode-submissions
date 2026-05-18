class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int array [] = new int [rows * cols];
        for(int i = 0; i < rows * cols;i++){
            int row = i / cols;
            int col = i % cols;
            array[i] = matrix[row][col];
        }
        // binary search o da voi array
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(array[mid] == target){
                return true;
            } else if (array[mid] > target){
                right = mid - 1;
            } else { 
                left = mid + 1;
            }
        }
        return false;
    }
}

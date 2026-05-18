class Solution {
    public int findMin(int[] nums) {
        int left = 0; 
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right - left) / 2;
            min = Math.min(min, nums[mid]);
            // Chỉ cần so sánh mid với nums right
            // Nếu mà mid > nums right => chứng tỏ min nằm ở bên phải
            // Nếu không thì min sẽ nằm bênt trái mid
            // và mid cũng rất có thể là min
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else{
                right = mid -1;
            }
        }
        return min;
    }
}

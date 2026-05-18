class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            // khi ra được mid, xem là mid thuộc nửa bên nào đang được sort
            // trường hợp nửa bên trái đang được sort
            if(nums[left] <= nums[mid]){
                // check xem target có nằm trong nửa này không
                // Neu co thi tim vào trong nửa này
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                } else{
                    left = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}

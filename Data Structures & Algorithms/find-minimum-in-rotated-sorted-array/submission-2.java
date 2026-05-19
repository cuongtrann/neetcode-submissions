class Solution {
    public int findMin(int[] nums) {
        int left = 0; 
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        if(nums[left] < nums[right]){
            return nums[left];
        }
        // is rotate
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                // Dịch sang phải để tìm trong bên phải
                left = mid + 1;
            } else{
                min = Math.min(min, nums[mid]);
                right = mid -1;
            }
        }
        return min;
    }

    // Có một cách khác đó là
    // Đầu tiên kiểm tra nếu left ban đầu mà bé hơn right thì return left luôn

    // Nếu không thì array này đã được rotate
    // Sẽ chia ra được làm 2 phần array đã được sort
    // Phần sort bên phải lúc nào cũng bé hơn phần search bên trái
    
    // Sẽ kiểm tra mid đang nằm trong array sorted bên trái hay sorted bên phải
    // Nếu đang nằm trong sorted bên trái thì sẽ cần phải dịch left để tìm ở trong phần bên phải
    // Nếu đã nằm trong sorted bên phải, thì có thể là nó có thể là min và sẽ cần dịch 
    // sang trái để tìm (Bởi vì đang nằm ở sort bên phải thì mid cần phải dịch sang trái để tìm min)
}

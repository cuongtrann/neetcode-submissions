class Solution {
    public int longestConsecutive(int[] nums) {
        // Duyệt qua nums và lưu vào tất cả value và vị trí vào map
        // Edge case nums empty
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int startValue = nums[0];
        int endValue = nums[0];
        int max = 1;
        for(int num : nums){
            if(startValue >= num){
                startValue = num;
            }
            if(endValue <= num){
                endValue = num;
            }
            set.add(num);
        }
        int count = 1;
        for(int i = startValue; i <= endValue; i++){
            // Check la i co ton tai khong da
            if(!set.contains(i)){
                continue;
            }
            if(set.contains(i+1)){
                count++;
            } else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

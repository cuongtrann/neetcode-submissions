class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i < nums.length; i++){
            int currentValue = nums[i];
            if(!set.add(currentValue)){
                return true;
            }
        }
        return false;
    }
}
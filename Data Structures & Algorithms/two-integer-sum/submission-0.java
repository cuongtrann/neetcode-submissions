class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapValuePosition = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mapValuePosition.containsKey(target - nums[i])){
                int position = mapValuePosition.get(target - nums[i]);
                int index1 = Math.min(position, i);
                int index2 = position + i - index1;
                return new int []
                {index1, index2};
            }
            mapValuePosition.put(nums[i], i);
        }
        return new int [2];
    }
}

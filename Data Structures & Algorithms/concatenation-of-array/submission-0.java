class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] result = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            result [i] = nums[i];
        }
        int j = 0;
        for(int i = nums.length; i < result.length; i++){
            result [i] = nums[j];
            j++;
        }
        return result;
    }
}
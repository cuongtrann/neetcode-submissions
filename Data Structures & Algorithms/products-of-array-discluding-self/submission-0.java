class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Tính bằng cách tạo ra 2 mảng prefix và subfix
        int [] prefix = new int[nums.length];
        int [] subfix = new int[nums.length]; 
        for(int i = 0; i < nums.length; i ++){
            if(i == 0){
                prefix[i] = nums[i];
            } else{
                prefix[i] = prefix[i-1] * nums[i];
            }
        }
        for(int i = nums.length - 1; i >=0; i--){
            if(i == nums.length - 1){
                subfix[i] = nums[i];
            }else{
                subfix[i] = subfix[i+1] * nums[i];
            }
        }
        for(int i =0; i<nums.length; i++){
            if(i == 0){
                nums[i] = subfix[i+1];
            }
            else if(i == nums.length -1){
                nums[i] = prefix[i-1];
            } else{
                nums[i] = prefix[i-1] * subfix[i+1];
            }
        }
        return nums;
    }
}
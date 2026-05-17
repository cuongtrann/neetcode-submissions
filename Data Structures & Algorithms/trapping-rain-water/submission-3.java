class Solution {
    public int trap(int[] height) {
        // Code theo cách đầu tiên là sử dụng prefix and subfix max
        int [] maxLeft = new int [height.length];
        int [] maxRight = new int [height.length];
        int maxLeftCurrent = height[0];
        int maxRightCurrent = height[height.length - 1];
        int result = 0;
        for(int i = 1; i < height.length; i++){
            maxLeft[i] = maxLeftCurrent;
            maxLeftCurrent = Math.max(maxLeftCurrent, height[i]);
        }
        for(int i = height.length -2; i>=0; i--){
            maxRight[i] = maxRightCurrent;
            maxRightCurrent = Math.max(maxRightCurrent, height[i]);
        }
        for(int i = 0; i < height.length -1; i++){
            int minLeftRight = Math.min(maxLeft[i], maxRight[i]);
            int water = minLeftRight - height[i];
            if(water > 0){
                result += water;
            }
        }
        return result;
    }
}

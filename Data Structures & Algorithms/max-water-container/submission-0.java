class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right){
            int hl = heights[left];
            int hr = heights[right];
            int water = (right - left) * Math.min(hl, hr);
            max = Math.max(max, water);
            if(hl < hr){
                left++;
            } else{
                right--;
            }
        }
        return max;
    }
}

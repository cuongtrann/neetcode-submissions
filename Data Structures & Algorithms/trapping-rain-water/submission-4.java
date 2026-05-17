class Solution {
    public int trap(int[] height) {
        // Code theo cach 2 pointers
        // maxLeft o dau 
        // maxRight o cuoi

        // nếu maxLeft > maxRight thì dịch ở bên maxRight
        // Nếu maxleft < maxRight thì dịch ở bên maxLeft
        // Sẽ có 2 con trỏ i và j ở 2 đầu
        int i = 0;
        int j = height.length-1;
        int maxLeft = height[i];
        int maxRight = height[j];
        int result =0;
        while(i<j){
            if(maxLeft < maxRight){
                i++;
                maxLeft = Math.max(maxLeft, height[i]);
                result += maxLeft - height[i];
            } else{
                j--;
                maxRight = Math.max(maxRight, height[j]);
                result += maxRight - height[j];
            }
        } 
        return result;
    }
}

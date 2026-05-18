class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Tìm max số chuối mà khỉ có thể ăn
        int max = 0;
        for(int i = 0; i< piles.length;i++){
            max = Math.max(max, piles[i]);
        }

        // range ăn của khỉ sẽ từ 1 đến max
        // [1,2,3,4]
        // Binary search
        int left = 1;
        int right = max;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            int mid = (left + right)/2;
            int hour = calculateHour(mid, piles);
            if(hour <= h){
                min = Math.min(min, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return min;
    }

    public int calculateHour(int banana, int [] piles){
        int hour = 0;
        for(int pile : piles){
            hour += (int) Math.ceil((double) pile / banana);
        }
        return hour;
    }
}

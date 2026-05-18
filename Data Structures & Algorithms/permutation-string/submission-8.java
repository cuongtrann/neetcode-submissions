class Solution {
    public boolean checkInclusion(String s1, String s2) {
                if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Map = new int[26];
        int [] windowMap = new int[26];
        // Co the khoi tao cùng với lúc add cái s1 vào arr
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            windowMap[s2.charAt(i) - 'a']++;
        }
        // check luon array co bang nhau ko o day
        if (Arrays.equals(s1Map, windowMap)) {
            return true;
        }        
        // Ở bài sliding window nên sử dụng for để dịch right
        for(int right = s1.length(); right < s2.length(); right++)
        {
            int left = right - s1.length();
            windowMap[s2.charAt(right) - 'a'] += 1;
            windowMap[s2.charAt(left) - 'a'] -= 1;
            // check subString hien tai co giong voi s1 khong
            if (Arrays.equals(s1Map, windowMap)) {
                return true;
            }
        }

        return false;
    }

}


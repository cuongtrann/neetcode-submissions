class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
        }
        // Giữ window bằng đúng với cả s1.length
        int left = 0;
        int right = left + s1.length() - 1;
        int [] windowMap = new int[26];
        // khoi tao windowMap
        for(int i = left; i < right;i++){
            windowMap[s2.charAt(i) - 'a']++;
        }
        while(right < s2.length()){
            windowMap[s2.charAt(right) - 'a'] += 1;
            // check subString hien tai co giong voi s1 khong
            if (Arrays.equals(s1Map, windowMap)) {
                return true;
            }
windowMap[s2.charAt(left) - 'a']--;            right++;
            left++;
        }
        return false;
    }

}


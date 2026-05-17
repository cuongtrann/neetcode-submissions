class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                // Dich left va tinh lai
                left = Math.max(map.get(c) + 1, left);
            }
            map.put(c, i);
            max = Math.max(max, i -left + 1);
        }
        return max;
    }
}

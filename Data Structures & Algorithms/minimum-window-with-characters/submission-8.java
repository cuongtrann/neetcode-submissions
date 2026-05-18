class Solution {
    public String minWindow(String s, String t) {
        int[] tMap = new int[60];
        int[] winMap = new int[60];
        int left = 0;
        int right = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        if (s.length() < t.length()) {
            return "";
        }
        // insert vao tMap truoc
        for (int i = 0; i < t.length(); i++) {
            tMap[t.charAt(i) - 'A']++;
            winMap[s.charAt(i) - 'A']++;
        }

        if (isValid(tMap, winMap)) {
            return s.substring(left, right);
        }

        for(int i = right; i < s.length(); i++){
            winMap[s.charAt(i) - 'A']++;
            while(isValid(tMap,winMap)){
                int currentLen = i - left + 1;
                if(minLen >= currentLen){
                    minLen = currentLen;
                    start = left;
                }
                // remove khoi map
                winMap[s.charAt(left) - 'A']--;
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public boolean isValid(int [] tMap, int[] winMap){
        for(int i = 0; i < 60;i++){
            if(tMap[i] != 0){
                if(tMap[i] > winMap[i]){
                    return false;
                }
            }
        }
        return true;
    }
}

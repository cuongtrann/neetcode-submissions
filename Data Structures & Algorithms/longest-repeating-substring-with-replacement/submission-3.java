class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr = new int [26];
        int left = 0;
        int max = 0;
        for(int right = 0; right < s.length(); right++){
            arr[s.charAt(right) -'A'] += 1;
            // Check điều kiện không thỏa mãn, phải dịch left
            int subLength = right - left + 1;
            while(left < s.length() && subLength - maxAppear(arr) > k){// tinh so xuat hien nhieu nhat trong sub string
                arr[s.charAt(left) - 'A'] --;
                subLength --;
                left++;
            }
            // tinh do dai
            max = Math.max(max, subLength);
        }
        return max;
    }

    public int maxAppear(int [] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}

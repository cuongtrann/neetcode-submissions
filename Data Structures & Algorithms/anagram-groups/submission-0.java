class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Tạo một cái map, lấy key là String đã sort
        Map<String, List<String>> map = new HashMap<>();
        // Dễ nhất là sort cái String thành các String giống nhau
        for(int i = 0; i < strs.length; i++){
            char [] strChar = strs[i].toCharArray();
            Arrays.sort(strChar);
            // Lưu ý chỗ key này phải là new String, toString trả về địa chỉ
            String key = new String(strChar);
            // put vào map 
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        // Value là List chứa String chưa sort

        // Trả về từ cái map.toList
        return new ArrayList(map.values());
    }
}
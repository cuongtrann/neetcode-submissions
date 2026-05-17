class Solution {

    public String encode(List<String> strs) {
        // solution đầu tiên là tách bằng cách sử dụng các kí hiệu
        // không thuộc ascii để ngăn tách
        StringBuilder rs = new StringBuilder();
        for(String s : strs){
            rs.append(s);
            rs.append('\uFFFF');
        }
        return rs.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '\uFFFF'){
                result.add(s.toString());
                s.setLength(0);
            } else{
                s.append(c);
            }
        }
        return result;
    }
}

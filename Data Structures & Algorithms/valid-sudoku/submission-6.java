class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Tạo ra 3 hashmap để lưu cho row, column, và square
        // Sử dụng array cũng ổn
        HashMap<Integer, Set<Character>> rowMap = new HashMap<>();
        HashMap<Integer, Set<Character>> colMap = new HashMap<>();
        HashMap<String, Set<Character>> squareMap = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c == '.'){
                    continue;
                }
                rowMap.putIfAbsent(i, new HashSet<>());
                if(rowMap.get(i).contains(c)){
                    return false;
                }
                rowMap.get(i).add(c);

                // column 
                colMap.putIfAbsent(j, new HashSet<>());
                if(colMap.get(j).contains(c)){
                    return false;
                }
                colMap.get(j).add(c);
                
                // square
                String square = (i/3) + "," + j/3;
                squareMap.putIfAbsent(square, new HashSet<>());
                if(squareMap.get(square).contains(c)){
                    return false;
                }
                squareMap.get(square).add(c);
            }
        }
        return true;
    }
}

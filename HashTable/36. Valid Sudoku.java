class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set1 = new HashSet<>();  
        int[][] dir = {{0, 0}, {1, 0}, {2, 0}, {0, 1}, {1, 1}, {2, 1}, {0, 2}, {1, 2}, {2, 2}};
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                else{
                    if(set1.contains(board[i][j]))
                        return false;
                    else
                        set1.add(board[i][j]);
                }
            }
            set1.removeAll(set1);
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.')
                    continue;
                else{
                    if(set1.contains(board[j][i]))
                        return false;
                    else
                        set1.add(board[j][i]);
                }
            }
            set1.removeAll(set1);
        }
        for(int i = 0; i < 9; i = i + 3){
            for(int j = 0; j < 9; j = j + 3){
                for(int[] d : dir){
                    if(board[d[0] + i][d[1] + j] == '.')
                        continue;
                    else{
                        if(set1.contains(board[d[0] + i][d[1] + j]))
                            return false;
                        else
                            set1.add(board[d[0] + i][d[1] + j]);
                    }
                }
                set1.removeAll(set1);
            }
        }
        return true;
    }
}

class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int row = matrix.length, col = matrix[0].length;
        int maxlen = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == '1'){
                    int len = 1;
                    boolean flag = true;
                    while(i + len < row && j + len < col && flag){
                        for(int k = i; k <= i + len; k++){
                            if(matrix[k][j+len] == '0'){
                                flag = false;
                                break;
                            }
                        }
                        for(int k = j; k <= j + len; k++){
                            if(matrix[i + len][k] == '0'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            len++;
                    }
                    maxlen = Math.max(maxlen, len);
                }
            }
        }
        return maxlen * maxlen;
    }
}


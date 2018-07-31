class Solution {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++)
            map[i][0] = 1;
        for(int j = 0; j < m; j++)
            map[0][j] = 1;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }
        return map[n - 1][m - 1];
    }
}

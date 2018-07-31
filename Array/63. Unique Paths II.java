class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(n == 0 || obstacleGrid[0][0] == 1 || obstacleGrid[n - 1][m - 1] == 1) return 0;
        for(int i = 0; i < n; i++){
            if(obstacleGrid[i][0] == 1){
                for(int a = i; a < n; a++)
                    obstacleGrid[a][0] = 0;
                break;
            }
            obstacleGrid[i][0] = 1;
        }
        for(int j = 1; j < m; j++){
            if(obstacleGrid[0][j] == 1){
                for(int b = j; b < m; b++)
                    obstacleGrid[0][b] = 0;
                break;
            }
            obstacleGrid[0][j] = 1;            
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            }
        }
        return obstacleGrid[n - 1][m - 1];
    }
}

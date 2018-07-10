class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int x = grid.length, y = grid[0].length, max = 0;
        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, Area(grid, i, j, x, y));
                }
            }
        return max;
    }
    public int Area(int[][] grid, int i, int j, int x, int y){
        if(i >= 0 && j >= 0 && i < x && j < y && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + Area(grid, i + 1, j, x, y) + Area(grid, i - 1, j, x, y) + Area(grid, i, j + 1, x, y) + Area(grid, i, j - 1, x, y); 
        }
        return 0;
    }
}

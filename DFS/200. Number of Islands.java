class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int len = grid.length;
        if(len == 0) return 0;
        int wid = grid[0].length;
        for(int i = 0; i < len; i ++){
            for(int j = 0; j < wid; j++){
                if(grid[i][j] == '1'){
                    dfs(i, j, wid, len, grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, int wid, int len, char[][] grid){
        if(i < 0 || j < 0 || i >= len || j >= wid || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(i - 1, j, wid, len, grid);
        dfs(i + 1, j, wid, len, grid);
        dfs(i, j + 1, wid, len, grid);
        dfs(i, j - 1, wid, len, grid);
    }
}

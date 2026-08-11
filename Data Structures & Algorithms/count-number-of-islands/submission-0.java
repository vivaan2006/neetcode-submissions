class Solution {
    // look into direcitosn and why we do it this way outside.
    public static final int[][] 
        directions = {
            {1,0},
            {-1, 0},
            {0,1},
            {0,-1}
        };
    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int islandCount = 0;

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    /**
    Important: review this DFS method and anctault udnerstnad how it words
    **/
    private void dfs(char[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= grid.length ||
            j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for(int[] direction: directions){
            dfs(grid, i + direction[0], j + direction[1]); // review why we have this line
        }
    }
}

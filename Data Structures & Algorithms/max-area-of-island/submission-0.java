class Solution {
    public static final int[][] 
        directions = {
            {1,0},
            {-1, 0},
            {0,1},
            {0,-1}
        };
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int maxArea = 0;
        for(int row = 0; row < ROWS; row++){
            for(int col = 0; col < COLS; col++){
                if(grid[row][col] == 1){
                    int area = dfs(grid, row, col);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length ||
            col >= grid[0].length || grid[row][col] == 0){
                return 0;
        }
        grid[row][col] = 0;
        int area = 1;
        for(int[] direction: directions){
            area += dfs(grid, row + direction[0], col + direction[1]);
        }
        return area;
    }
}
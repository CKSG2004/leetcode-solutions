class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid==null||grid.length==0){
            return 0;
        }

        int ic=0;
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    ic++;
                    sinkIsland(grid, i, j);
                }
            }
        }
        return ic;
    }

    private void sinkIsland(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        sinkIsland(grid, r + 1, c); // Down
        sinkIsland(grid, r - 1, c); // Up
        sinkIsland(grid, r, c + 1); // Right
        sinkIsland(grid, r, c - 1); // Left
    }
}
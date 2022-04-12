package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/6 8:34
 */
public class LeetCode200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (grid[i][j] == '1') {
                    dfs(grid,i,j);
                    ++res;
                }
            }
        }
        return res;

    }
    public void dfs(char[][] grid, int x, int y) {
        int rows = grid.length;
        int columns = grid[0].length;
        while (x < 0 || y < 0 || x >= rows || y >= columns || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        dfs(grid, x - 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x + 1, y);
        dfs(grid, x, y + 1);
    }
}

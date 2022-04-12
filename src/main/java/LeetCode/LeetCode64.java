package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/1 7:30
 */
public class LeetCode64 {

    public static int minPathSum(int[][] grid) {
        int rows = grid.length, colums = grid[0].length;
        int[][] dp = new int[rows][colums];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; ++i) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < colums; ++i) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < rows; ++i) {
            for (int j = 1; j < colums; ++j) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[rows - 1][colums - 1];
    }
}

package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 18:28
 */
public class LeetCode62 {
    public int uniquePaths(int m, int n) {
        int rows = m, colums = n;
        int[][] dp = new int[rows][colums];
        for (int i = 0; i < rows; ++i) {
            dp[i][0] =1;
        }
        for (int i = 1; i < colums; ++i) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < rows; ++i) {
            for (int j = 1; j < colums; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}

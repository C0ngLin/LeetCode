package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 11:53
 */
public class LeetCode79 {
    public boolean exist(char[][] board, String word) {
        int rows = board.length, columns = board[0].length;
        boolean[][] biaoji = new boolean[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                    if (check(board, biaoji, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        return false;
    }
    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}




package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/1 10:27
 */
public class LeetCode72_11 {


    public int minDistance(String word1, String word2) {
        int rows = word1.length();
        int columns = word2.length();
        if (rows * columns == 0) {
            return rows + columns;
        }
        int[][] ints = new int[rows + 1][columns + 1];
        for (int i = 0; i < columns + 1; ++i) {
            ints[0][i] = i;
        }
        for (int i = 0; i < rows + 1; ++i) {
            ints[i][0] = i;
        }
        for (int i = 1; i < rows + 1; ++i) {
            for (int j = 1; j < columns + 1; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                    ints[i][j] =Math.min(ints[i][j-1], Math.min(ints[i-1][j-1], ints[i-1][j]));
                    ints[i][j] = Math.min(ints[i - 1][j - 1], Math.min(ints[i][j - 1], ints[i - 1][j]));
                }
                else {
//                    ints[i][j] = Math.min(ints[i][j-1], Math.min(ints[i-1][j-1], ints[i-1][j])) + 1;
                    ints[i][j] = Math.min(ints[i - 1][j - 1], Math.min(ints[i][j - 1], ints[i - 1][j]))+1;
                }

            }
        }
        return ints[rows][columns];
    }
}

package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/4 8:06
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }

}

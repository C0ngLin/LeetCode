package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/4 18:35
 */
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

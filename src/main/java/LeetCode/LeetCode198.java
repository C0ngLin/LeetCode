package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/5 17:08
 */
public class LeetCode198 {
    public int rob(int[] nums) {
        int diyixiang = 0, dierxiang = 0, tmp;
        for (int num : nums) {
            tmp = dierxiang;
            dierxiang = Math.max(diyixiang + num, dierxiang);
            diyixiang = tmp;
        }
        return dierxiang;
    }
}

package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 13:23
 */
public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int tmp = 0, resmax = nums[0];
        for (int num :
                nums) {
            tmp = Math.max(tmp + num, num);
            resmax =Math.max(tmp, resmax);
        }
        return resmax;
    }
}

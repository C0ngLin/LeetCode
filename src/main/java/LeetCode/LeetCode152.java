package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/5 14:53
 */
public class LeetCode152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(nums[i] * imin, nums[i]);
            max = Math.max(imax, max);
        }
        return max;
    }
}

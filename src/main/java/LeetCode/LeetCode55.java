package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 13:49
 */
public class LeetCode55 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return true;
        }
        for (int i = len-2; i >-1; --i) {
            if (nums[i] != 0) {
            } else {
                int j = 1;
                for (; j <= i; j++) {
                    if (nums[i - j] > j) {
                        break;
                    }
                }
                if (j > i) {
                    return false;
                }

            }

        }
        return true;
    }
}

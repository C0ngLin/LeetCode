package LeetCode;

import java.util.HashSet;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/4 12:01
 */
public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int number = num;
                int length = 1;
                while (set.contains(number + 1)) {
                    ++number;
                    ++length;
                }
                res = Math.max(res, length);
            }
        }
        return res;
    }
}

package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/5 16:55
 */
public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += num == candidate ? 1 : -1;
        }
        return candidate;
    }
}

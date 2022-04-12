package LeetCode;

import java.util.HashMap;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/4 9:02
 */
public class LeetCode1 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{nums[i], map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

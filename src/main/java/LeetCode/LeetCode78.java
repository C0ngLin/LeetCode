package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 9:10
 */
public class LeetCode78 {

    static List<Integer> l1 = new ArrayList<Integer>();
    static List<List<Integer>> l2 = new ArrayList<List<Integer>>();

    public static List<List<Integer>> subsets(int[] nums) {
        dfs1(nums, 0);
        return l2;

    }

    public static void dfs1(int[] nums, int cur) {
        if (cur == nums.length) {
            l2.add(new ArrayList<Integer>(l1));
            return;
        }
        l1.add(nums[cur]);
        dfs1(nums, cur + 1);
        l1.remove(nums.length - 1);
        dfs1(nums, cur + 1);
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 9:53
 * 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class LeetCode46_11 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return res;
        }
        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, path, res, used, len, 0);
        return res;
    }
    private void dfs(int[] nums,List<Integer> path,
                     List<List<Integer>> res,
                     boolean[] used,int len,int depth) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, path, res, used, len, depth + 1);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
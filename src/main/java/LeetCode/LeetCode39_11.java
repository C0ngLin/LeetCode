package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 8:12
 */
public class LeetCode39_11 {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(path, candidates, target, res, len, 0);
        return res;
    }

    private void dfs(Deque<Integer> path, int[] candidates, int target,
                     List<List<Integer>> res, int len, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);

            dfs(path, candidates, target-candidates[i], res, len, i);

            path.removeLast();
        }
    }
}

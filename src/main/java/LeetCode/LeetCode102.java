package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 18:33
 */
public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new ArrayDeque<>();
        if (root != null) {
            que.offer(root);
        }
        while (!que.isEmpty()) {
            int n = que.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                TreeNode tree = que.poll();
                tmp.add(tree.val);
                if (tree.left != null) {
                    que.offer(tree.left);
                }
                if (tree.right != null) {
                    que.offer(tree.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}

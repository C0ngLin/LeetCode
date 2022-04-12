package LeetCode;

import LeetCode.TreeNode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/4 8:22
 */

public class LeetCode124 {
    int max = Integer.MIN_VALUE/10;
    public int maxPathSum(TreeNode root) {
        int newmax = scan(root);
        return Math.max(newmax, max);
    }
    public int scan(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE/10;
        }else {
            int left = scan(root.left);
            int right = scan(root.right);
            max = Math.max(max, Math.max(root.val + left + right, Math.max(right, left)));
            return Math.max(root.val, Math.max(root.val + left, root.val + right));
        }
    }
    /*class Solution(object):
    def maxPathSum(self, root):
        self.max_sum = -sys.maxsize - 1
        def scan(root):
            if root is None:
                return -sys.maxsize - 1
            left = scan(root.left)
            right = scan(root.right)
            self.max_sum = max(self.max_sum, root.val + left + right, left, right) # 情况1,5,6，不累加直接放变量里暂存
            return max(root.val, root.val + left, root.val + right)  # 情况2,3,4 ，累加需要递归
        new_max = scan(root)
        return max(self.max_sum, new_max)  # 两类情况再求最大*/
}

package LeetCode;


/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 17:35
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);


    }

    public boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val && check(root1.right, root2.left) && check(root1.left, root2.left);
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 15:50
 */
public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        zhong(root,res);
        return res;

    }
    public void zhong(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        zhong(root.left, res);
        res.add(root.val);
        zhong(root.right, res);
    }
}

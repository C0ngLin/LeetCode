package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/3 8:20
 */
public class LeetCode105 {


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end,
                                     HashMap<Integer, Integer> map) {
        if (p_end == p_start) {
            return null;
        }
        int val = preorder[p_start];
        TreeNode res = new TreeNode(val);
        int i_root_index = map.get(val);
        int leftnum = i_root_index - i_start;
        res.left = buildTreeHelper(preorder, p_start + 1, p_start + 1 + leftnum,
                inorder, i_start, i_root_index, map);
        res.right = buildTreeHelper(preorder, p_start + 1 + leftnum, p_end,
                inorder, i_root_index + 1, i_end, map);
        return res;
    }

}

package LeetCode;

import java.util.HashMap;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/3 14:54
 */
public class LeetCode105_11 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, preorder.length, 0, inorder.length, map);

    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int pzuo, int pyou, int izuo, int iyou, HashMap<Integer, Integer> map) {
        if (pzuo == pyou) {
            return null;
        }
        int root_val = preorder[pzuo];
        TreeNode res = new TreeNode(root_val);
        int i_root_index = map.get(root_val);
        int left_num = i_root_index - izuo;
        res.left = buildTree(preorder, inorder, pzuo + 1, pzuo + 1 + left_num, izuo, i_root_index, map);
        res.right = buildTree(preorder, inorder, pzuo + 1 + left_num, pyou, i_root_index + 1, iyou, map);
        return res;
    }
}

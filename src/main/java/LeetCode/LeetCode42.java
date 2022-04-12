package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 9:16
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
 */
public class LeetCode42 {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, res = 0, lmax = 0, rmax = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lmax) {
                    lmax = height[l];
                } else {
                    res += lmax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rmax) {
                    rmax = height[r];
                } else {
                    res += rmax - height[r];
                }
                r--;
            }
        }
        return res;
    }
}

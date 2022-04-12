package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 14:07
 */
public class LeetCode84 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }
        int area = 0;
        int[] newheights = new int[len+2];
        for (int i = 0; i < len; ++i) {
            newheights[i + 1] = heights[i];
        }
        heights = newheights;
        len += 2;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(0);
        for (int i = 1; i < len; ++i) {
            while (heights[stack.peekLast()] > heights[i]) {
                int height = heights[stack.removeLast()];
                int width = i - stack.peekLast() - 1;
                area = Math.max(area, height * width);
            }
            stack.addLast(i);
        }
        return area;
    }
}

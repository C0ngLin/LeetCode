package LeetCode;

public class LeetCode32 {


    public int longestValidParentheses(String s) {
        int light = 0, right = 0, res = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                light++;

            } else {
                right++;

            }
            if (right == light) {
                res = Math.max(res, right * 2);
            } else if (right > light) {
                light = right = 0;

            }

        }
        light = right = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '(') {
                light++;

            } else {
                right++;

            }
            if (right == light) {
                res = Math.max(res, light * 2);
            } else if (light > right) {
                light = right = 0;

            }

        }
        return res;
    }
}

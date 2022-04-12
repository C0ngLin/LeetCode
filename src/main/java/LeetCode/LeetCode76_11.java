package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/1 17:32
 */
public class LeetCode76_11 {


    public String minWindow(String s, String t) {
        int left = 0, right = 0,
                windowLength = Integer.MAX_VALUE,
                slen = s.length(),
                tlen = t.length(),
                start = 0;
        int[] map = new int[128];
        for (char c :
                t.toCharArray()) {
            map[c]++;
        }
        while (right < slen) {
            if (map[s.charAt(right++)]-- > 0) {
                --tlen;
                while (tlen == 0) {
                    if (right - left < windowLength) {
                        windowLength = right - left;
                        start = left;
                    }
                    if (map[s.charAt(left++)]++ == 0) {
                        ++tlen;
                    }
                }
            }
        }
        if (windowLength != Integer.MAX_VALUE) {
            return s.substring(start, start + windowLength);
        }
        return "";
    }

}

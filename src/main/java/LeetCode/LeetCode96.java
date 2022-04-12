package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/2 16:32
 */
public class LeetCode96 {
    Map<Integer, Integer> map = new HashMap<>();
    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            int left = numTrees(n - i);
            int right = numTrees(i - 1);
            count += left * right;
        }
        map.put(n, count);
        return count;
    }
}

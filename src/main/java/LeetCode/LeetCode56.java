package LeetCode;

import java.util.BitSet;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 17:12
 */
public class LeetCode56 {

    public static int[][] merge(int[][] intervals) {
        BitSet bitSet = new BitSet();
        int max = 0;
        for (int[] interval : intervals) {
            int temp = interval[1] * 2 + 1;
            bitSet.set(interval[0] * 2, temp, true);
            max = temp >= max ? temp : max;
        }

        int index = 0, count = 0;
        while (index < max) {
            int start = bitSet.nextSetBit(index);
            int end = bitSet.nextClearBit(start);

            int[] item = {start >> 1, (end - 1) >> 1};
            intervals[count++] = item;

            index = end;
        }
        int[][] ret = new int[count][2];
        for (int i = 0; i < count; ++i) {
            ret[i] = intervals[i];
        }

        return ret;
    }
}

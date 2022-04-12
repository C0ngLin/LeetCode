package LeetCode;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/1 15:25
 */
public class LeetCode75 {
    public void sortColors(int[] nums) {
        int pr = 0;
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[pr];
                nums[pr] = tmp;
                ++pr;
            }
        }
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 1) {
                int tmp = nums[i];
                nums[i] = nums[pr];
                nums[pr] = tmp;
                ++pr;
            }
        }
    }
}

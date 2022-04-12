package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/8 15:18
 */
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] chudu = new int[numCourses];
        List<List<Integer>> ad = new ArrayList<>();
        Queue<Integer> queque = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            ad.add(new ArrayList<>());
        }
        for (int[] cp : prerequisites) {
            chudu[cp[0]]++;
            ad.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (chudu[i] == 0) {
                queque.add(i);
            }
        }
        while (!queque.isEmpty()) {
            int pre = queque.poll();
            numCourses--;
            for (int cur : ad.get(pre)) {
                if (--chudu[cur] == 0) {
                    queque.add(cur);
                }
            }
        }
        return numCourses == 0;
    }
}

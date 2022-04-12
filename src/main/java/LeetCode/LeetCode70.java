package LeetCode;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/1 9:29
 */
public class LeetCode70 {

    public int climbStairs(int n) {
        int diyijie = 0, dierjie = 0, disanjie = 1;
        for (int i = 1; i <= n; ++i) {
            diyijie = dierjie;
            dierjie = disanjie;
            disanjie = diyijie + dierjie;
        }
        return disanjie;
    }
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int diyijie = 1, dierjie = 2, disanjie = 0;
        for (int i = 3; i <= n; ++i) {
            disanjie = diyijie + dierjie;
            diyijie = dierjie;
            dierjie = disanjie;

        }
        return dierjie;
    }
}

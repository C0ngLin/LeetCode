package LeetCode;

public class LeetCode31 {


    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] > nums[i + 1]) {
            i--;
        }
        if (i > 0) {
            int j = nums.length - 1;
            while (nums[i] < nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void swap(int[] num, int x, int y) {
        int tmp = num[x];
        num[x] = num[y];
        num[y] = tmp;
    }

    public static void reverse(int[] nums, int x) {
        int left = x, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}

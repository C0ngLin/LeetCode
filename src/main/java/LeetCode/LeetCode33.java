package LeetCode;

public class LeetCode33 {


    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int light = 0, right = n - 1;
        while (light <= right) {
            int mid = (light + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    light = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    light = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

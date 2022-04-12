package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/10 17:20
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        return 2;
    }

    public int re2() {
        return 2;
    }

    class quciksort {
        public void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public int patrion(int[] arr, int left, int right) {
            int pivot = arr[left];
            int index = pivot + 1;
            for (int i = index; i <= right; ++i) {
                if (arr[i] > pivot) {
                    swap(arr, index, arr[i]);
                    index++;
                }
            }
            swap(arr, pivot, index - 1);
            return index - 1;
        }

        public void quicksort(int[] arr) {
            
        }
    }
}

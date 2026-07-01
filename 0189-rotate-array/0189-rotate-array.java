class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int[] arr = new int[k];

        int temp = nums.length - k;

        for(int i = 0; i < k; i++) {
            arr[i] = nums[temp++];
        }

        for(int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for(int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}
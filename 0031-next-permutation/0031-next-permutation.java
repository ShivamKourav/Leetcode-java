class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int bigindex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                bigindex = i - 1;
                break;
            }
        }

        if (bigindex != -1) {

            int swapindex = bigindex;

            for (int j = n - 1; j > bigindex; j--) {
                if (nums[j] > nums[bigindex]) {
                    swapindex = j;
                    break;
                }
            }

            int temp = nums[bigindex];
            nums[bigindex] = nums[swapindex];
            nums[swapindex] = temp;
        }

        int left = bigindex + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
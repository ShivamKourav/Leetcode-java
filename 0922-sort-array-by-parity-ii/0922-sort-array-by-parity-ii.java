class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenidx = 0;
        int oddidx = 1;
        int n = nums.length;

        while (evenidx < n && oddidx < n) {
            if (nums[evenidx] % 2 == 0) {
                evenidx += 2;
            } else if (nums[oddidx] % 2 == 1) {
                oddidx += 2;
            } else {
                int temp = nums[evenidx];
                nums[evenidx] = nums[oddidx];
                nums[oddidx] = temp;

                evenidx += 2;
                oddidx += 2;
            }
        }

        return nums;
    }
}
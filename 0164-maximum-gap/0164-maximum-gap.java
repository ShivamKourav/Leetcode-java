class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        int diff = 0;

        if(n < 2)
            return 0;

        Arrays.sort(nums);

        for(int i = 0; i < n - 1; i++) {
            int d = nums[i + 1] - nums[i];

            if(diff < d) {
                diff = d;
            }
        }

        return diff;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;

        int[] ps = new int[n];

        // Prefix Sum nikalna
        ps[0] = nums[0];

        for (int x = 1; x < n; x++) {
            ps[x] = ps[x - 1] + nums[x];
        }

        int count = 0;

        // i = starting index
        // j = ending index
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum;

                if (i == 0) {
                    sum = ps[j];
                } else {
                    sum = ps[j] - ps[i - 1];
                }

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
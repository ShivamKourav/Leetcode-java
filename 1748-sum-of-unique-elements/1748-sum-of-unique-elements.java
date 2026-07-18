class Solution {
    public int sumOfUnique(int[] nums) {

        int[] freq = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 1) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
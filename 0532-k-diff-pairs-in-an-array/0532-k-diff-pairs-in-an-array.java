class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i] - k)) {
                pairs.add(nums[i] - k);
            }
            
            if(set.contains(nums[i] + k)) {
                pairs.add(nums[i]);
            }

            set.add(nums[i]);
        }

        return pairs.size();
    }
}
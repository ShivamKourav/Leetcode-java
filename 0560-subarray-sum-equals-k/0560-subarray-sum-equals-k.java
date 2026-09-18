class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int result = 0;
        int cumsum = 0;
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            cumsum = cumsum + nums[i];
            if (mp.containsKey(cumsum - k)) {
                result = result + mp.get(cumsum - k);
            }
            mp.put(cumsum, mp.getOrDefault(cumsum, 0) + 1);
        }
        return result;
    }
}
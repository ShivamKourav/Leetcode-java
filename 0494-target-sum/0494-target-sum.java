class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,nums,target);
    }
    public int solve(int i, int[] nums, int target){
        if(i == nums.length){
            if(target == 0) return 1;
            else return 0;
        }
        int add = solve(i+1,nums,target-nums[i]);
        int sub = solve(i+1,nums,target+nums[i]);
        return add+sub;
    }
}
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int first = 0;
        int last = 0;
        int count = 0;
        for(int i=0; i<n-1; i++){
            first = Math.max(first, nums[i] + i);
            if(last == i){
                last = first;
                count++;
            }
        }
        return count;
    }
}
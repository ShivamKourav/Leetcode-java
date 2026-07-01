class Solution {
    public int[] rearrangeArray(int[] nums) {
        int length = nums.length;
        int[] positive = new int[length/2];
        int[] negative = new int[length/2];
        int j=0, k=0;
        for(int i=0; i<length; i++){
            if(nums[i] < 0){
                negative[j++] = nums[i];
            }
            else {
                positive[k++] = nums[i];
            }
        }
        j=0;
        k=0;
        for(int i=0;i<length;i++){
            if(i%2==0){
                nums[i] = positive[j++];
            }
            else{
                nums[i] = negative[k++];
            }
        }
        return nums;
    }
}
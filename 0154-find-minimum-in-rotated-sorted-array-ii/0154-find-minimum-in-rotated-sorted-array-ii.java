class Solution {
    public int findMin(int[] nums) {
         int left = 0;
         int right = nums.length - 1;
         int min = nums[0];

         while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < min)  
                min = nums[mid];
            
            else if(nums[mid] < nums[right])
                right = mid - 1;

            else if(nums[mid] > nums[right])
                left = mid + 1;
            
            else 
                right--;
         }
         return min;
    }
}
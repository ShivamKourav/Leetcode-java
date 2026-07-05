class Solution {

    public int binarySearch(int[] nums, int target, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }

        return -1;
    }

    public int findPivot(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        if (nums[s] <= nums[e])
            return e;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (mid + 1 < nums.length && nums[mid] > nums[mid + 1])
                return mid;

            if (mid - 1 >= 0 && nums[mid] < nums[mid - 1])
                return mid - 1;

            if (nums[s] <= nums[mid])
                s = mid + 1;
            else
                e = mid - 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;

        int pivot = findPivot(nums);

        if (target >= nums[0] && target <= nums[pivot])
            return binarySearch(nums, target, 0, pivot);

        else
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}
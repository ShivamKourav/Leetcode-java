
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();

        int[] result = new int[n - k + 1];
        int index = 0;

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                result[index] = nums[dq.peekFirst()];
                index++;
            }
        }

        return result;
    }
}

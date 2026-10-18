class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    void backtrack(int[] nums, List<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;
            }

            temp.add(nums[i]);
            used[i] = true;

            backtrack(nums, temp, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}

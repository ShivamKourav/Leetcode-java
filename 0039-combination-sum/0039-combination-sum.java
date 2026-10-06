class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int[] candidates, int target, int index,
               List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            list.add(candidates[i]);

            solve(candidates, target - candidates[i],
                  i, list, ans);
                  
            list.remove(list.size() - 1);
        }
    }
}
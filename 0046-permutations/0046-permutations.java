class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, res);
        return res;
    }

    void solve(int[] a, int i, List<List<Integer>> res) {
        if (i == a.length) {
            List<Integer> list = new ArrayList<>(a.length);
            for (int x : a) list.add(x);
            res.add(list);
            return;
        }

        for (int j = i; j < a.length; j++) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;

            solve(a, i + 1, res);

            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
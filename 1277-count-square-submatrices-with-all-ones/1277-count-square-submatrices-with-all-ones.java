
class Solution {
    public int countSquares(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) continue;
                else if (i == 0 || j == 0) {
                    nums[i][j] = 1;
                }
                else {
                    nums[i][j] = 1 + Math.min(nums[i - 1][j],
                        Math.min(nums[i][j - 1], nums[i - 1][j - 1])
                    );
                }
                count += nums[i][j];
            }
        }
        return count;
    }
}

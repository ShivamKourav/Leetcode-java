class Solution {
    public int numberOfBeams(String[] bank) {
        int prevCount = 0;
        int ans = 0;

        for (int i = 0; i < bank.length; i++) {
            String row = bank[i];
            int currCount = 0;

            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '1') {
                    currCount++;
                }
            }

            if (currCount > 0) {
                ans += prevCount * currCount;
                prevCount = currCount;
            }
        }

        return ans;
    }
}
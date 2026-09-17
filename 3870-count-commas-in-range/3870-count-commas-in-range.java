class Solution {
    public int countCommas(int n) {

        int countCommas = 0;

        if (n < 1000) {
            return 0;
        } else {

            countCommas = (n - 1000) + 1;
        }

        return countCommas;
    }
}
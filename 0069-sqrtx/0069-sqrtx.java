class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int ans = -1;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } 
            else if (square < x) {
                ans = (int) mid;
                s = (int) mid + 1;
            } 
            else {
                e = (int) mid - 1;
            }
        }

        return ans;
    }
}
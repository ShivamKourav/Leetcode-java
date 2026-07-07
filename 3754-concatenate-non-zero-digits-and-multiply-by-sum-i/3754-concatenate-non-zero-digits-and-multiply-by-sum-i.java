class Solution {
    public long sumAndMultiply(int n) {
        long ans = -1;
        long x = 0;
        long place = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (digit != 0) {
                x = digit * place + x;
                place *= 10;
                sum += digit;
            }
        }

        ans = x * sum;
        return ans;
    }
}
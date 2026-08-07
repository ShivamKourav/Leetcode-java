class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }

    public boolean isValid(int num, int t) {
        int product = 1;
        int x = num;

        if (x == 0) {
            product = 0;
        } else {
            while (x > 0) {
                product *= (x % 10);
                x /= 10;
            }
        }

        if(product % t == 0)
            return true;
        else
            return false;
    }
}
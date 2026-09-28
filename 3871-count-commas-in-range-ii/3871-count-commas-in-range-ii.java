class Solution {
    public long countCommas(long n) {
        long result = 0;
        long lower = 1000;
        long comma = 1;
        while(lower <= n){
            long upper = lower * 1000 - 1;
            if(upper > n) upper = n;
            long count = upper - lower + 1;
            result = result + (count*comma);
            lower = lower * 1000;
            comma++;
        }
        return result;
    }
}
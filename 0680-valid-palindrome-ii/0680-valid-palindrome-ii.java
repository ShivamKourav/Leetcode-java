class Solution {

    public boolean check(StringBuilder sb, int st, int e) {
        while (st < e) {
            if (sb.charAt(st) != sb.charAt(e)) {
                return false;
            }
            st++;
            e--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);

        int st = 0;
        int e = sb.length() - 1;

        while (st < e) {

            if (sb.charAt(st) == sb.charAt(e)) {
                st++;
                e--;
            } else {
                return check(sb, st + 1, e) || check(sb, st, e - 1);
            }
        }

        return true;
    }
}
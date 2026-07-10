class Solution {

    public int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int totalCount = 0;
        for (int center = 0; center < s.length(); center++) {
            int oddCount = expand(s, center, center);
            int evenCount = expand(s, center, center + 1);
            totalCount += oddCount + evenCount;
        }
        return totalCount;
    }
}
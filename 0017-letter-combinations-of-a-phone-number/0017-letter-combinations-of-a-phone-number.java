class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0)
            return res;

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", res, phone);
        return res;
    }

    void backtrack(String digits, int index, String path,
                   List<String> res, String[] phone) {

        if (index == digits.length()) {
            res.add(path);
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            backtrack(digits, index + 1, path + ch, res, phone);
        }
    }
}
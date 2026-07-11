class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();

        String patternMap = createMapping(pattern);

        for (int i = 0; i < words.length; i++) {

            String s = createMapping(words[i]);

            if (patternMap.equals(s)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public String createMapping(String str) {

        char start = 'a';
        char[] map = new char[300];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map[ch] == 0) {
                map[ch] = start;
                start++;
            }

            ans.append(map[ch]);
        }

        return ans.toString();
    }
}
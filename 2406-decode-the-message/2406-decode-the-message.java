class Solution {
    public String decodeMessage(String key, String message) {
        char start = 'a';
        char[] mapping = new char[300];

        //create mapping
        for(char ch : key.toCharArray()){
            if(ch != ' ' && mapping[ch] == 0){
                mapping[ch] = start;
                start++;
            }
        }
        //use mapping
        StringBuilder ans = new StringBuilder();
        for(char ch : message.toCharArray()){
            if(ch == ' '){
                ans.append(' ');
            }
            else {
                ans.append(mapping[ch]);
            }
        }
        return ans.toString();
    }
}
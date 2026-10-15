
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (seen[idx]) {
                continue;
            }

            while (stack.length() > 0
                    && stack.charAt(stack.length() - 1) > ch
                    && lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {

                char removed = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
                seen[removed - 'a'] = false;
            }

            stack.append(ch);
            seen[idx] = true;
        }

        return stack.toString();
    }
}

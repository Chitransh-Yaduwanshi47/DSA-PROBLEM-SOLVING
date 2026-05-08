class Solution {
    public int minimumLengthEncoding(String[] words) {
          Set<String> set = new HashSet<>(Arrays.asList(words));

        for (String word : words) {

            // remove all suffixes
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }

        int ans = 0;

        for (String word : set) {
            ans += word.length() + 1; // +1 for '#'
        }

        return ans;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {

        // Agar length alag hai to anagram ho hi nahi sakta
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // s ke characters ko count karo
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // t ke characters ko minus karo
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // Agar kisi bhi index par value 0 nahi hai
        // to frequency same nahi hai
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
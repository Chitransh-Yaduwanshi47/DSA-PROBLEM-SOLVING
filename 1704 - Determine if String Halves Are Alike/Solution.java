public class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();

        int mid = n / 2;

        int i = 0, j = mid;

        int countL = 0;
        int countR = 0;

        Set<Character> vowels = new HashSet<>();
        String vowelString = "aeiouAEIOU";
        for (char c : vowelString.toCharArray()) {
            vowels.add(c);
        }

        while (i < n / 2 && j < n) {
            if (vowels.contains(s.charAt(i))) countL++;

            if (vowels.contains(s.charAt(j))) countR++;

            i++;
            j++;
        }

        return countL == countR;
    }
}
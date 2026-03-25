class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];

        int m = s.length();
        int n = p.length();

        // p ka frequency count
        for (char ch : p.toCharArray()) {
            arr[ch - 'a']++;
        }

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (j < m) {
            // current character include karo
            arr[s.charAt(j) - 'a']--;

            // window size match
            if (j - i + 1 == n) {

                // check all zero
                if (isAllZero(arr)) {
                    result.add(i);
                }

                // window slide
                arr[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }

        return result;
    }

    // helper function
    private boolean isAllZero(int[] arr) {
        for (int x : arr) {
            if (x != 0)
                return false;
        }
        return true;
    }
}
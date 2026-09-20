class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            int j = 0;
            boolean ok = true;

            for (char c : q.toCharArray()) {
                if (j < pattern.length() && c == pattern.charAt(j)) {
                    j++;
                } else if (Character.isUpperCase(c)) {
                    ok = false;
                    break;
                }
            }

            if (j != pattern.length()) ok = false;

            ans.add(ok);
        }

        return ans;
    }
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];

        for (int[] t : trust) {
            count[t[0]]--; // trust dene wala
            count[t[1]]++; // trust lene wala
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
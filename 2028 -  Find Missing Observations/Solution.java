class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int m = rolls.length;

        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }

        int totalSum = (n + m) * mean;

        int missingSum = totalSum - sum;

        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            missingSum--;
        }

        for (int i = 0; i < n && missingSum > 0; i++) {

            int add = Math.min(5, missingSum);

            ans[i] += add;
            missingSum -= add;
        }

        return ans;
    }
}
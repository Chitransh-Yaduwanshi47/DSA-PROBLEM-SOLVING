class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}
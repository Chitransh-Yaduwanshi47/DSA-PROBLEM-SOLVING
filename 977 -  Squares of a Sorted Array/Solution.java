class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1; // ptr = Pointer

        while (start <= end) {

            int ss = nums[start] * nums[start]; // ss = Start Square
            int es = nums[end] * nums[end];     // es = End Square

            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }

            ptr--;
        }

        return ans;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0 , j = 0;
        int minL = n+1;
        int sum = 0;

        while (j<n){
            sum+= nums[j];

            //chota karna chah rahe hain window ko  
            while (sum>=target){
                minL = Math.min(minL , j-i+1);
                sum-= nums[i];
                i++; //right shift of i
            }
            j++;
        }
        return minL == n+1 ? 0 : minL;   
    }
}
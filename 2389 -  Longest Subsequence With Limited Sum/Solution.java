class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        
        // Step 1: sort array
        Arrays.sort(nums);
        
        // Step 2: prefix sum
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        
        int m = queries.length;
        int[] result = new int[m];
        
        // Step 3: for each query, apply upper_bound (binary search)
        for (int i = 0; i < m; i++) {
            result[i] = upperBound(nums, queries[i]);
        }
        
        return result;
    }
    
    // Custom upper_bound function
    private int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left; // index = count of elements <= target
    }
}
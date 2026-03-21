class Solution {

    // ----------- FIND MIN (Pivot logic) -----------
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {

            // remove duplicates from left
            while (l < nums.length - 1 && nums[l] == nums[l + 1]) {
                l++;
            }

            // remove duplicates from right
            while (r > 0 && nums[r] == nums[r - 1]) {
                r--;
            }

            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return nums[r];
    }

    // ----------- SEARCH (Driver ke liye required) -----------
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return true;

            // duplicates handle
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
            }
            // left sorted
            else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // right sorted
            else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return false;
    }
}
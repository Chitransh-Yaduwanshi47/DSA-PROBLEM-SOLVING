class Solution {
    public int findFloor(int[] arr, int x) {

        int start = 0, end = arr.length - 1;
        int result = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid;
                start = mid + 1;   // ✅ move RIGHT (last occurrence)
            } 
            else if (arr[mid] < x) {
                result = mid;      // possible floor
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return result;
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length;
        int n = arr2.length;

        Arrays.sort(arr2); // sort arr2
        int count = 0;

        for (int i = 0; i < m; i++) {
            int l = 0, r = n - 1;
            int x = arr1[i] - d;
            int y = arr1[i] + d;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (arr2[mid] < x) {
                    l = mid + 1;
                } else if (arr2[mid] > y) {
                    r = mid - 1;
                } else {
                    count++;
                    break;
                }
            }
        }

        return m - count;
    }
}
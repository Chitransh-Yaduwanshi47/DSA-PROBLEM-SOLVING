class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int l = 0, r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == k ){
                return true;
            } else if(arr[mid]<k){
                l = mid + 1;
            } else{
                r = mid-1;
            }
        }
        return false;
    }
}
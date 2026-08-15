class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList();

        int n = candies.length;
        int max = candies[0];

        for(int i=0; i<n; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }

        for(int val: candies){
            if(val + extraCandies >= max){
                ans.add(true);
            } else{
                ans.add(false);
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];
        
        int m = s.length();
        int n = p.length();
        
        for(char ch : p.toCharArray()) {
            arr[ch - 'a']++;
        }
        
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();
        
        while(j < m) {

            arr[s.charAt(j) - 'a']--;
            
            if(j - i + 1 == n) {
                
                if(isAllZero(arr)) {
                    result.add(i);
                }
                
                arr[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        
        return result;
    }
    
    private boolean isAllZero(int[] arr) {
        for(int x : arr) {
            if(x != 0) return false;
        }
        return true;
    }
}
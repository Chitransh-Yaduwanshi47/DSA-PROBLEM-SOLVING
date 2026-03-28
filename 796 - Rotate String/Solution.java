class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
       
       // Check if the lengths match and if goal is a substring of s + s
        if (m == n && (s + s).contains(goal)) {
            return true;
        }
        return false;
    }
}


//Approach-(Concatenation with itself contains all possible rotations)
//T.C : O(n)
//S.C : O(1)
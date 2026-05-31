class Solution {
	static boolean isValidAns(int[] stalls, int k, int minDistance) {
		// brute force
		int cowCount = 1;
		// first cow is placed at 0 index
		int lastPosition = 0;
		for (int i = 1; i < stalls.length; i++) {
			
			// current position par tabhi place karunga
			// jab current aur previous cow ke beech ka distance
			// >= minDistance ho
			
			if (stalls[i] - stalls[lastPosition] >= minDistance) {
				
				// can place safely
				cowCount++;
				
				// nayi cow place ho chuki hai
				// isliye lastPosition update karna padega
				lastPosition = i;
				
				if (cowCount == k) {
					// saari cows place kar chuke hain
					return true;
				}
			}
		}
		return false;
	}
	public int aggressiveCows(int[] stalls, int k) {
		Arrays.sort(stalls);
		int n = stalls.length;
		
		int start = 0;
		int end = stalls[n - 1] - stalls[0];
		int ans = -1;
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			if (isValidAns(stalls, k, mid)) {
				// hume k possible solution milgya
				// ans store
				// move to right
				ans = mid;
				start = mid + 1;
			}
			else {
				// mid k sath there is no possible arrangement to place
				// cows
				// move to left
				end = mid - 1;
			}
		}
		return ans ;
	}
}
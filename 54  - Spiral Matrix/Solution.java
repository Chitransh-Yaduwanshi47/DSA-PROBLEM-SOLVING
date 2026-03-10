import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, down = m - 1;
        int left = 0, right = n - 1;

        int dir = 0;

        List<Integer> result = new ArrayList<>();

        while (top <= down && left <= right) {

            if (dir == 0) { // left -> right
            //left to right
            //constant : row (top)
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            else if (dir == 1) { // top -> down
            //top to down 
            //constant : column (right)
                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            else if (dir == 2) { // right -> left
            //right to left
            //constant : row (down)
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }

            else if (dir == 3) { // down -> top
            //down to top 
            //constant : column (left)
                for (int i = down; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            dir = (dir + 1) % 4;
        }

        return result;
    }
}
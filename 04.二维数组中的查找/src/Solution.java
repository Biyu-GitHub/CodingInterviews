public class Solution {
    public boolean Find(int target, int[][] array) {
        int m = array.length;
        int n = array[0].length;

        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (target == array[i][j])
                return true;
            else if (target < array[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
}
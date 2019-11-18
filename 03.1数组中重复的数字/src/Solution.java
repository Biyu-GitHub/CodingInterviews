public class Solution {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                int j = numbers[i];
                if (numbers[j] == j) {
                    duplication[0] = j;
                    return true;
                } else {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return false;
    }
}

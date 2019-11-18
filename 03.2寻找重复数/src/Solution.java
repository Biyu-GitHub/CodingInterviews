class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;

        int l = 1;
        int r = n;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int count = countNumber(nums, l, m, n);

            if (l == r) {
                if (count > 1)
                    return l;
                else
                    break;
            }


            if (count > m - l + 1)
                r = m;
            else
                l = m + 1;
        }
        return -1;
    }

    private int countNumber(int[] nums, int l, int r, int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (nums[i] >= l && nums[i] <= r)
                count++;
        }
        return count;
    }
}
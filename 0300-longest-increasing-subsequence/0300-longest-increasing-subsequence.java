class Solution {
    public int lengthOfLIS(int[] nums) {

        int nums2[] = getSortedUniqueArray(nums);
        return getLCS(nums, nums2);
    }

    private int getLCS(int[] nums, int[] nums2) {
        int n = nums.length;
        int m = nums2.length;
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums[i - 1] == nums2[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }

    private int[] getSortedUniqueArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums)
            set.add(val);

        int nums2[] = new int[set.size()];
        int i = 0;
        for (int number : set) {
            nums2[i] = number;
            i++;
        }
        Arrays.sort(nums2);
        return nums2;
    }
}
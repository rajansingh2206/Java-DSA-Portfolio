class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }
        if (breakpoint == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakpoint; i--) {
            if (nums[i] > nums[breakpoint]) {
                swap(nums, i, breakpoint);
                break;
            }
        }
        reverse(nums, breakpoint + 1, n - 1);
    }

    private void swap(int nums[], int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }

    private void reverse(int nums[], int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
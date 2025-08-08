class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int start, int end) {
        if (start >= end)
            return 0;
        int count = 0;
        int mid = start + (end - start) / 2;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);
        count += countPairs(nums, start, mid, end);
        merge(nums, start, mid, end);
        return count;
    }

    private int countPairs(int nums[], int start, int mid, int end) {
        int count = 0;
        int j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && (long) nums[i] > (long) 2 * nums[j]) 
                j++;
            count += j - (mid + 1);
        }
        return count;
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= mid) 
            temp[k++] = arr[i++];
        
        while (j <= end) 
            temp[k++] = arr[j++];
        
        for (i = start, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
}
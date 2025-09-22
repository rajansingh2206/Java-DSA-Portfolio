class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int intervals_with_index[][] = new int[intervals.length][3];
        for (int i = 0; i < intervals.length; i++) {
            intervals_with_index[i][0] = i;
            intervals_with_index[i][1] = intervals[i][0];
            intervals_with_index[i][2] = intervals[i][1];
        }
        Arrays.sort(intervals_with_index, Comparator.comparingDouble(o -> o[2]));
        // for (int i = 0; i < intervals.length; i++) {
        //     System.out.print(intervals_with_index[i][0] + " " +
        //             intervals_with_index[i][1] + " " +
        //             intervals_with_index[i][2]);
        //     System.out.println();
        // }
        int count = 0;
        int last_end_time = intervals_with_index[0][2];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals_with_index[i][1] < last_end_time) {
                count++;
            }
            else
                last_end_time=intervals_with_index[i][2];
        }
        return count;
    }
}
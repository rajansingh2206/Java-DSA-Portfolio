class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));
        int count = 0;
        int last_end_time = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < last_end_time) {
                count++;
            }
            else
                last_end_time=intervals[i][1];
        }
        return count;
    }
}
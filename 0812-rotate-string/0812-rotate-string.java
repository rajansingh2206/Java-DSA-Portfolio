class Solution {
    public boolean rotateString(String s, String goal) {
        String s2=s+s;
        return s.length()!=goal.length()?false:s2.contains(goal);
    }
}
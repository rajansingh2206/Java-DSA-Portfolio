class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.trim().toLowerCase().toCharArray();
        char[] b=t.trim().toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean ans=Arrays.equals(a,b);
        return ans;
    }
}
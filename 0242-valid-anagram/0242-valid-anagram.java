class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.trim().toCharArray();
        char b[]=t.trim().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            return true;
        else
            return false;
    }
}
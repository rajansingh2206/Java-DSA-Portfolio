class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partitions = new ArrayList<>();
        backtrack(s, partitions, ans);
        return ans;
    }

    private void backtrack(String s, List<String> partitions, List<List<String>> ans) {
        if (s.isEmpty()) {
            ans.add(new ArrayList<>(partitions));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(0, i + 1);
            if (isPalindrome(sub)) {
                partitions.add(sub);
                backtrack(s.substring(i + 1), partitions, ans);
                partitions.remove(partitions.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        return str.equals(reverse);
    }

}
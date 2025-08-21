class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans=new ArrayList<>();
        int []p_char_count=new int[26];
        int []s_char_count=new int[26];

        int p_length=p.length();
        int s_length=s.length();

        if(p_length>s_length) return ans;

        for(int i=0;i<p_length;i++)
        {
            p_char_count[p.charAt(i)-'a']++;
            s_char_count[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(p_char_count,s_char_count))  ans.add(0);

        for(int i=p_length;i<s_length;i++)
        {
            s_char_count[s.charAt(i)-'a']++;
            s_char_count[s.charAt(i-p_length)-'a']--;
            if(Arrays.equals(p_char_count,s_char_count))  ans.add(i-p_length+1);
        }
        return ans;
    }
}
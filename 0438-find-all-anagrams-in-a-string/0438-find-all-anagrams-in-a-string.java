class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans=new ArrayList<>();
        int anagramSize=p.length();
        char pchar[]=p.toCharArray();
        Arrays.sort(pchar);
        String sortedP=new String(pchar);
        for(int i=0;i<s.length()-anagramSize+1;i++)
        {
            String subString=s.substring(i,i+anagramSize);
            char []element=subString.toCharArray();
            Arrays.sort(element);
            if(sortedP.equals(new String(element)))
                ans.add(i);
        }
        return ans;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[] element=str.toCharArray();
            Arrays.sort(element);
            String sortedString=new String(element);
            map.computeIfAbsent(sortedString,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
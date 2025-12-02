class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        StringBuffer sb=new StringBuffer();
        for(Map.Entry<Character,Integer> m:list){
            int count=m.getValue();
            int cnt=0;
            while(cnt<count){
                sb.append(m.getKey());
                cnt++;
            }
        }
        return sb.toString();
    }
}
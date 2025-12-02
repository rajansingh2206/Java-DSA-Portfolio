class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1,Map.Entry<Character,Integer> e2){
                return e2.getValue()-e1.getValue();
            }
        }
        );
        String ans="";
        for(Map.Entry<Character,Integer> m:list){
            int count=m.getValue();
            int cnt=0;
            while(cnt<count){
                ans+=m.getKey();
                cnt++;
            }
        }
        return ans;
    }
}
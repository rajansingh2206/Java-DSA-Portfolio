class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split("\\s");
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        if(words.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(map1.containsKey(c))
            {
                if(!map1.get(c).equals(words[i]))
                    return false;
            }
            else if(map2.containsKey(words[i])){
                if( ! (map2.get(words[i])==c) ) 
                    return false;
            }
            else{
                map1.put(c,words[i]);
                map2.put(words[i],c);
            }
        }
        return true;
    }
}
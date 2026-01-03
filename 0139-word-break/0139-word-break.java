class Solution {

    Node root=new Node();
    class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    private void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int currChar=word.charAt(i)-'a';
            if(curr.children[currChar]==null)
                curr.children[currChar]=new Node();
            curr=curr.children[currChar];
        }
        curr.eow=true;
    }

    private boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int currChar=word.charAt(i)-'a';
            if(curr.children[currChar]==null)
                return false;
            curr=curr.children[currChar];
        }
        return curr.eow;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for(String word:wordDict)
            insert(word);

        Map<String,Boolean> memo=new HashMap<>();
        return helper(s,memo);
    }

    private boolean helper(String s, Map<String,Boolean> map){

        if(s.length()==0)
            return true;

        if(map.containsKey(s))
            return map.get(s);

        for(int i=1;i<=s.length();i++){

            String s1=s.substring(0,i);
            String s2=s.substring(i);
            if(search(s1)==true && helper(s2,map)==true){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}
class Trie {

    class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            } 
        }
    }

    Node root;

    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int currChar=word.charAt(level)-'a';
            if(curr.children[currChar]==null){
                curr.children[currChar]=new Node();
            }
            curr=curr.children[currChar];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int currChar=word.charAt(level)-'a';
            if(curr.children[currChar]==null){
                return false;
            }
            curr=curr.children[currChar];
        }
        return curr.eow==true;
    }
    
    public boolean startsWith(String word) {
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int currChar=word.charAt(level)-'a';
            if(curr.children[currChar]==null){
                return false;
            }
            curr=curr.children[currChar];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
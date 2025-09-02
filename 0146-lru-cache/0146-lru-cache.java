class LRUCache {

    class Node
    {
        int key,value;
        Node next;
        Node prev;
        Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }

    private int capacity;
    private Node head;
    private Node tail;
    Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        
        if(!map.containsKey(key))   
            return -1;

        Node foundNode=map.get(key);
        int ans=foundNode.value;
        remove(foundNode);
        addToFront(foundNode);
        return ans;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key))
        {
            remove(map.get(key));
            map.remove(key);
        }

        Node newNode=new Node(key,value);
        addToFront(newNode);
        map.put(key,newNode);

        if(map.size()>capacity)
        {
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
    
    private void remove(Node oldNode)
    {
        oldNode.prev.next=oldNode.next;
        oldNode.next.prev=oldNode.prev;
    }

    private void addToFront(Node newNode)
    {
        newNode.prev=head;
        newNode.next=head.next;

        head.next.prev=newNode;
        head.next=newNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
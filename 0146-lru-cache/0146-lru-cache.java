class LRUCache {

    class Node{
        int key,value;
        Node prev;
        Node next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
            this.prev=null;
            this.next=null;
        }
    }

    private int capacity;
    private Node head;
    private Node tail;
    private int size;
    private Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        size=0;
    }
    
    public int get(int key) {

        if(!map.containsKey(key)){
            return -1;
        }

        Node getNode=map.get(key);
        int value=getNode.value;
        remove(getNode);
        addToFront(getNode);

        return value;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            remove(map.get(key));
            map.remove(key);
            size--;
        }

        Node newNode=new Node(key,value);
        addToFront(newNode);
        map.put(key,newNode);
        size++;

        if(size>capacity){
            map.remove(tail.prev.key);
            remove(tail.prev);
            size--;
        }
    }

    private void remove(Node oldNode){
        oldNode.prev.next=oldNode.next;
        oldNode.next.prev=oldNode.prev;
    }
    private void addToFront(Node newNode){
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
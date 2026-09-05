class LRUCache {
    HashMap<Integer,Node> map = new HashMap<>();
    int capacity;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    class Node{
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key,int value){
            this.key=key;
            this.value = value;
        }
    }
    

    public LRUCache(int capacity) {
        
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        node.prev=tail.prev;
        node.next=tail;

        tail.prev.next=node;
        tail.prev=node;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value=value;
            remove(node);
            insert(node);
        }else{
            Node node = new Node(key,value);
            map.put(key,node);
            insert(node);
            if(map.size()>capacity){
                Node lru = head.next;
                remove(lru);
                map.remove(lru.key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
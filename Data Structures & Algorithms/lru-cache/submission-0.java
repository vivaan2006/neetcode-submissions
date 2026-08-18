
class LRUCache { 
    private Map<Integer, LinkedListNode> cache;
    private LinkedList<LinkedListNode> lru;
    int capacity;

    private class LinkedListNode{
        int key;
        int value;
        LinkedListNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) { 
        this.capacity = capacity;
        cache = new HashMap<>();
        lru = new LinkedList<>();
    } 

    public int get(int key) { 
        if(cache.containsKey(key)){
            LinkedListNode node = cache.get(key);
            lru.remove(node);
            lru.addFirst(node);
            return node.value;
        }
        return -1;
    } 

    public void put(int key, int value) { 
        if(cache.containsKey(key)){
            LinkedListNode node = cache.get(key);
            lru.remove(node);
            lru.addFirst(node);
            node.value = value;
        } else{
            if(cache.size() >= capacity){
                LinkedListNode node = lru.removeLast();
                cache.remove(node.key);
            }
            LinkedListNode newNode = new LinkedListNode(key, value);
            lru.addFirst(newNode);
            cache.put(key, newNode);
        }
    } 
}
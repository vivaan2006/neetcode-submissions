
class LRUCache { 
    HashMap<Integer, LinkedListNode> cache = new HashMap<>();
    LinkedList<LinkedListNode> lru = new LinkedList<>();
    int capacity;

    private class LinkedListNode{
        int key;
        int value;
        LinkedListNode (int key, int value){
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
            LinkedListNode valueNode = cache.get(key);
            lru.remove(valueNode);
            lru.addFirst(valueNode);
            return valueNode.value;
        }
        return -1;
    } 

    public void put(int key, int value) { 
        if(cache.containsKey(key)){
            LinkedListNode valueNode = cache.get(key);
            lru.remove(valueNode);
            valueNode.value = value;
            lru.addFirst(valueNode);
        } else{
            if(cache.size() >= capacity){
                LinkedListNode removedNode = lru.removeLast();
                cache.remove(removedNode.key);
            } 
            LinkedListNode updated = new LinkedListNode(key, value);
            lru.addFirst(updated);
            cache.put(key, updated);
        }
    } 
}





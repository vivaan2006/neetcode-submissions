class KthLargest {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = minHeap;

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k){
            minHeap.poll();
        } 
        return minHeap.peek();
    }
}

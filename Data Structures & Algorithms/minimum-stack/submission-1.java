class MinStack {
    //idea to use doubley linked list, store the min at the font
    // maybe even use a minheap to back a stack, dont liek thsi tho
    // 2 stacks?? one storing mininim and tthe other has everyone order
    LinkedList<Node> minStackList = new LinkedList<>();
    LinkedList<Node> totalList = new LinkedList<>();
    class Node{
        int val;
        Node(int val){
            this.val = val;
        }
    }

    public MinStack() {
        minStackList = new LinkedList<>();
        totalList = new LinkedList<>();
    }

    public void push(int val) {
        Node valueNode = new Node(val);
        if(minStackList.isEmpty() || valueNode.val <= minStackList.getFirst().val){
            minStackList.addFirst(valueNode);
        }
        totalList.addFirst(valueNode);
    }
    
    public void pop() {
        Node popped = totalList.removeFirst();
        if (popped == minStackList.getFirst()) {
            minStackList.removeFirst();
        }
    }
    
    public int top() {
        return totalList.getFirst().val;
    }
    
    public int getMin() {
        return minStackList.getFirst().val;
    }
}

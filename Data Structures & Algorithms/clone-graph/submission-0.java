/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> oldtonew = new HashMap<>();
        Queue<Node> bfs = new LinkedList<>();
        oldtonew.put(node, new Node(node.val));
        bfs.add(node);
        while(!bfs.isEmpty()){
            Node current = bfs.poll();
            for(Node neighbor : current.neighbors){
                if(!oldtonew.containsKey(neighbor)){
                    oldtonew.put(neighbor, new Node(neighbor.val));
                    bfs.add(neighbor);
                }
            oldtonew.get(current).neighbors.add(oldtonew.get(neighbor));
            }
        }
        return oldtonew.get(node);
    }
}
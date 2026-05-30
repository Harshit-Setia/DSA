class Solution {
    void clone(Node node,HashMap<Node,Node> oldToNew){
        if(!oldToNew.containsKey(node)){
            Node newNode=new Node(node.val);
            oldToNew.put(node,newNode);

            for(Node nb:node.neighbors){
                if(!oldToNew.containsKey(nb)){
                    clone(nb,oldToNew);
                }
                newNode.neighbors.add(oldToNew.get(nb));
            }
        }
    }
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Node,Node> oldToNew=new HashMap<>();
        clone(node,oldToNew);
        return oldToNew.get(node);
    }
}
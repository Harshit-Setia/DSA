class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        this.k=k;
        for(int i:nums){
            addVal(i);
        }
    }

    void addVal(int val){
        pq.offer(val);
        if(pq.size()>k)pq.poll();
    }
    
    public int add(int val) {
        addVal(val);
        return pq.peek();
    }
}

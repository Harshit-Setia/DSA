class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:stones){
            pq.offer(i);
        }

        while(pq.size()>1){
            int diff=(pq.poll()-pq.poll());
            if(diff!=0)pq.add(diff);
        }

        if(pq.size()==0)return 0;
        return pq.poll();
    }
}

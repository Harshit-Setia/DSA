class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> q=new LinkedList<>();

        for(char ch:tasks){
            freq[ch-'A']++;
        }

        for(int i:freq){
            if(i>0){
                pq.add(i);
            }
        }

        int time=0;

        while(!pq.isEmpty()||!q.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int cnt=pq.poll();
                if(--cnt>0)
                q.add(new int[]{cnt,time+n});
            }
            if(!q.isEmpty()&&q.peek()[1]<=time){
                pq.add(q.poll()[0]);
            }
        }

        return time;
    }
}

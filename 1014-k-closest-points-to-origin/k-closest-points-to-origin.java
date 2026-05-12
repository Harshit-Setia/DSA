class Solution {

    double dist(double a,double b){
        return Math.sqrt((a*a)+(b*b)); 
    }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));

        int n=points.length;
        for(int i=0;i<n;i++){
            double d=dist(points[i][0],points[i][1]);

            pq.add(new double[]{d,i});
            if(pq.size()>k)pq.poll();    
        }

        int [][]ans=new int[k][2];

        for(int i=0;i<k;i++){
            ans[i]=points[(int)pq.poll()[1]];
        }

        return ans;
    }
}

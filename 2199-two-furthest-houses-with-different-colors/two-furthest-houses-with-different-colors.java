class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            int j=n-1;
            while(j>i){
                if(colors[i]!=colors[j]){
                    max=Math.max(max,j-i);
                    break;
                }
                j--;
            }
        }

        return max;
    }
}
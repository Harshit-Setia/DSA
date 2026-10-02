class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] ansArr=new boolean[n];
        for(int i:nums){
            if(i<=n){
                ansArr[i-1]=true;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!ansArr[i])ans.add(i+1);
        }
        return ans;
    }
}
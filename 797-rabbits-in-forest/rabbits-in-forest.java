class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i:answers){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        int count=0;

        for(int i:mp.keySet()){
            int temp=mp.get(i);
            if(i==0){
                count+=temp;
            }
            else if(temp<=i+1){
                count+=(i+1);
            }
            else{
                count+=((i+1)*((temp+i)/(i+1)));
            } 
        }

        return count;
    }
}
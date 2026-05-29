class Solution {
    boolean dfs(int curr,HashMap<Integer,List<Integer>> adjList,boolean []vis){
        if(vis[curr]){
            return false;
        }
        if(adjList.get(curr).size()==0){
            return true;
        }
        vis[curr]=true;

        for(int i:adjList.get(curr)){
            if(!dfs(i,adjList,vis))return false;
        }

        vis[curr]=false;
        adjList.get(curr).clear();

        return true;

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adjList=new HashMap<>();
 
        for(int i=0;i<numCourses;i++){
            adjList.put(i,new ArrayList<>());
        }

        for(int []i:prerequisites){
            adjList.get(i[1]).add(i[0]);
        }

        boolean []vis=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!dfs(i,adjList,vis))return false;
        }
        return true;
    }
}
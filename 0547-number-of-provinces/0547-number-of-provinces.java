class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]) {
                bfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i, boolean[] visited, int[][] isConnected){
        visited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front = q.remove();
            for(int j=0; j<isConnected.length; j++){
                if(isConnected[front][j]==1 && visited[j]==false){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}
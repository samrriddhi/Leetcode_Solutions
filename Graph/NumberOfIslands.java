class Solution {
    int m;
    int n;
    char[][] grid;
    int count;
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        this.grid=grid;
        m = grid.length;
        n=grid[0].length;
        visited = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(i,j);
                }
            }
        }
        return count;
    }
    void dfs(int i,int j){
        if(i < 0 || i>=m || j < 0 || j >=n){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        if(visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j);
        dfs(i+1,j);
        dfs(i,j-1);
        dfs(i,j+1);
    }
    
}
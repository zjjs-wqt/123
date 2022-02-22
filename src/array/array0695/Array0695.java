package array.array0695;

public class Array0695 {
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int Mmax = 0 ;
        for(int i = 0 ; i < grid.length ; ++i){
            for (int j = 0 ; j < grid[0].length ; ++j){
                if(grid[i][j] == 1 ){
                    int sum = 0 ;
                    Mmax=Math.max(Mmax,dfs(grid,i,j));
                }
            }
        }
        return Mmax;
    }

    private int dfs(int[][] grid, int i, int j) {
        int cnt = 0 ;
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]==0){}
        else {
            cnt++;
            grid[i][j]=0;
            cnt+=dfs(grid,i+1,j);
            cnt+=dfs(grid,i-1,j);
            cnt+=dfs(grid,i,j+1);
            cnt+=dfs(grid,i,j-1);
        }
        return cnt;

    }

}
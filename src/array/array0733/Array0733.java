package array.array0733;

public class Array0733 {
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return dfs(image,sr,sc,newColor,image[sr][sc]);
    }

    private int[][] dfs(int[][] image, int sr, int sc, int newColor, int i) {
        if( sr < 0 || sc < 0 || sr >=image.length || sc >= image[0].length || image[sr][sc]!=i  || image[sr][sc] == newColor){
            
        }
        else {
            int tmp = image[sr][sc];
            image[sr][sc] = newColor;
            dfs(image,sr,sc-1,newColor,tmp);
            dfs(image,sr,sc+1,newColor,tmp);
            dfs(image,sr+1,sc,newColor,tmp);
            dfs(image,sr-1,sc,newColor,tmp);
        }
        return image;
    }
}
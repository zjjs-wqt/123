package array.array0563;

public class Array0563 {
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (){}
    TreeNode (int val) {this.val=val;}
    TreeNode (int val , TreeNode left , TreeNode right ){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
class Solution {
    public int sum = 0 ;
    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }
    public int dfs (TreeNode root){
        if( root == null ){
            return 0;
        }
        int l = dfs (root.left);
        int r = dfs (root.right);
        sum += Math.abs(l - r);
        return l + r + root.val ;
    }
}
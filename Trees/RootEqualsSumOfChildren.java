class Solution {
    public boolean checkTree(TreeNode root) {
        int sum=root.left.val+root.right.val;
        if(root.val==sum){
            return true;
        }
        return false;
    }
}
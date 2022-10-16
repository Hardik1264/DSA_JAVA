
//   Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  public class Trees {
    boolean sym(TreeNode left , TreeNode right){
        if(left == null || right==null) 
            return left == right;
        
        if(left.val != right.val)
            return false;
        
        return sym(left.left, right.right) && sym(left.right, right.left); 
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) 
            return true;
        
        return sym(root.left, root.right);
    }
}
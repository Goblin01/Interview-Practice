// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int sum(TreeNode root) { 
    
    if(root == null) return 0;
    return root.data + sum(root.left) + sum(root.right);
}

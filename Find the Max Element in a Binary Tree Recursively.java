// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMax(TreeNode root) {
    if(root == null) return 0;
    int ld = findMax(root.left);
    int rd = findMax(root.right);
    int rtd = root.data;
    
    return Math.max(rtd,Math.max(ld, rd));
}

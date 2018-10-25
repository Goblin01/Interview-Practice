// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int pathLengthFromRoot(TreeNode root, int n1) {
    if(root == null) return 0;
    if(root.data == n1) return 1;
    int l = pathLengthFromRoot(root.left, n1);
    int r = pathLengthFromRoot(root.right, n1);
    if(l > 0){
        return l+1;
    }else if(r > 0){
        return r+1;
    }
    return 0;
}

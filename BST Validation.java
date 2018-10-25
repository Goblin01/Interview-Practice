// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean validateBST(TreeNode root) {
    return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public static boolean validateBST(TreeNode node, int min, int max){
    
    if(node == null) return true;
    
    if(node.data > max || node.data < min) return false;
    
    return validateBST(node.left, min, node.data) && validateBST(node.right, node.data, max);
}

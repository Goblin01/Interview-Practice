// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findDeepest(TreeNode root) {
    if(root == null) return null;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    TreeNode curr = root;
    q.add(root);
    
    while(q.peek() != null){
        curr = q.poll();
        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);
    }
    
    return curr;
}

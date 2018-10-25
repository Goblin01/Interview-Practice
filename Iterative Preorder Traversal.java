// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> preList = new ArrayList<Integer>();
    Stack<TreeNode> stk = new Stack<TreeNode>();
    if(root == null) return preList;
    
    stk.push(root);
    while(!stk.empty()){
        TreeNode curr = stk.pop();
        preList.add(curr.data);
        if(curr.right != null) stk.push(curr.right);
        if(curr.left != null) stk.push(curr.left);
    }
    return preList;
}

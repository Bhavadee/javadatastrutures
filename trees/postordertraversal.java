class Solution {
    List <Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
        {
            return ans;
        }
        
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        ans.add(root.val);
        return ans;
        
    }
}
class Solution {
    List <Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
        {
            return ans;
        }
        ans.add(root.val);
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        return ans;
        
    }
}
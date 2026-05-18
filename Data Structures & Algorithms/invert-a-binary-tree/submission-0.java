/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // Duyệt đến đâu thì thêm queue
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            // Swap left va right
            // Tạo temp = left;
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null){
                // add left va right vao queue
                queue.offer(current.left);
            }

            if(current.right != null){
                queue.offer(current.right);
            }
        }
        return root;
    }
}
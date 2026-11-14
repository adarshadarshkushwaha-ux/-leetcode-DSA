class Solution {
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        if (root == nullptr) return false;

        // Leaf node: path ends here
        if (root->left == nullptr && root->right == nullptr) {
            return root->val == targetSum;
        }

        int remaining = targetSum - root->val;
        return hasPathSum(root->left, remaining) || hasPathSum(root->right, remaining);
    }
};
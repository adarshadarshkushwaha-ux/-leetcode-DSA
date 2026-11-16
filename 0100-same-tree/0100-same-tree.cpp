/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        // both empty
        if (p == nullptr && q == nullptr) return true;

        // one empty, other not
        if (p == nullptr || q == nullptr) return false;

        // values differ
        if (p->val != q->val) return false;

        // check both subtrees
        return isSameTree(p->left, q->left) && isSameTree(p->right, q->right);
    }
};
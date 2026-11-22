
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* curr = head;

        while (curr != nullptr && curr->next != nullptr) {
            if (curr->val == curr->next->val) {
                ListNode* dup = curr->next;
                curr->next = dup->next;   // skip the duplicate
                delete dup;               // free it (optional on LeetCode)
            } else {
                curr = curr->next;        // advance only when no duplicate
            }
        }

        return head;
    }
};
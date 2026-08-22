/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool isPalindrome(struct ListNode* head)
{
    struct ListNode *slow = head;
    struct ListNode *fast = head;

    // Find the middle
    while(fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    // Reverse the second half
    struct ListNode *prevnode = NULL;
    struct ListNode *currentnode = slow;
    struct ListNode *nextnode = slow;

    while(nextnode != NULL)
    {
        nextnode = nextnode->next;
        currentnode->next = prevnode;
        prevnode = currentnode;
        currentnode = nextnode;
    }

    // Compare both halves
    struct ListNode *first = head;
    struct ListNode *second = prevnode;

    while(second != NULL)
    {
        if(first->val != second->val)
        {
            return false;
        }

        first = first->next;
        second = second->next;
    }

    return true;
}
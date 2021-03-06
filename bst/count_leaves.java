//Count number of leaves in binary tree
/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    int count = 0;
    int countLeaves(Node node) 
    {
        count_leaves(node);
        return count;
    }
    void count_leaves(Node node)
    {
        if(node == null)
        {
            return;
        }
        if(node.left == null && node.right ==null)
        {
            count = count + 1;
        }
        count_leaves(node.left);
        count_leaves(node.right);
    }
}
